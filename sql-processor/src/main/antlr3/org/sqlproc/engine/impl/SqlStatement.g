grammar SqlStatement;

//options {
//    k=2;                                // needed for "&&" and "||"
//}

@lexer::header { 
package org.sqlproc.engine.impl;
}

@header { 
package org.sqlproc.engine.impl;

import java.util.Map;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.type.SqlMetaType;
}

@lexer::members {
  private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
  public List<ErrorMsg> getErrors() {
    return errors;
  }

  public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    String msg = super.getErrorMessage(e,tokenNames);
    errors.add(ParserUtils.create(msg,e,tokenNames));
    return msg;
  }
}

@members {
  private Token getLastToken() {
    return input.LT(-1);
  }

  private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
  public List<ErrorMsg> getErrors() {
    return errors;
  }

  @Override
  public void reportError(RecognitionException e) {
    String msg = super.getErrorMessage(e,tokenNames);
    errors.add(ParserUtils.create(msg,e,tokenNames));
  }
  
  String getText(Token token) {
    if (token == null)
      return null;
    return token.getText();
  }
  
  void add(StringBuilder text) {
    int type = getLastToken().getType();
    if (type == ESC_COLON || type == ESC_STRING || type == ESC_AT || type == ESC_LBRACE || type == ESC_RBRACE || type == ESC_HASH || type == ESC_BOR)
      text.append(getLastToken().getText().substring(1));
    else
      text.append(getLastToken().getText());
  }
  
  void addText(Object target, StringBuilder text) {
    ParserUtils.addText(target, text);
  }
  
  void addColumn(Object target, SqlMappingItem col, StringBuilder text) {
    ParserUtils.addColumn(target, col, text);
  }
  
  SqlMappingItem newColumn(Token col) {
    return ParserUtils.newColumn(col.getText());
  }
  
  void addIdent(Object target, SqlMetaIdent ident, StringBuilder text) {
    ParserUtils.addIdent(target, ident, text);
  }
  
  SqlMetaIdent newIdent(Token ident, Token caseConversion) {
    return ParserUtils.newIdent(ident.getText(), getText(caseConversion));
  }
  
  void addConstant(Object target, SqlMetaConst cnst, StringBuilder text) {
    ParserUtils.addConstant(target, cnst, text);
  }
  
  SqlMetaConst newConstant(Token cnst, Token caseConversion) {
    return ParserUtils.newConstant(cnst.getText(), getText(caseConversion));
  }
  
  void addOperator(SqlMetaLogExpr expr, boolean isAnd) {
    if (isAnd)
      expr.addElement(new SqlMetaLogOperator(SqlMetaLogOperator.Type.AND));
    else
      expr.addElement(new SqlMetaLogOperator(SqlMetaLogOperator.Type.OR));
  }

  void setMetaType(SqlTypeFactory typeFactory, SqlMappingItem item, String sMetaType) {
    item.setMetaType(typeFactory.getMetaType(sMetaType));
  }

  void setMetaType(SqlTypeFactory typeFactory, SqlMetaIdent item, String sMetaType) {
    item.setMetaType(typeFactory.getMetaType(sMetaType));
  }

  void setMetaType(SqlTypeFactory typeFactory, SqlMetaConst item, String sMetaType) {
    item.setMetaType(typeFactory.getMetaType(sMetaType));
  }
}

parse [SqlTypeFactory _typeFactory] returns [SqlMetaStatement metaStatement]
scope {StringBuilder text;boolean hasOutputMapping;SqlTypeFactory typeFactory;}
@init {$metaStatement = new SqlMetaStatement(); $parse::text = new StringBuilder();$parse::typeFactory=_typeFactory;}
@after {$metaStatement.setHasOutputMapping($parse::hasOutputMapping);}
	: sql[metaStatement] EOF 
	;

sql [SqlMetaStatement metaStatement]	
@after {addText(metaStatement, $parse::text);}
	:	
	// except LBRACE STRING COLON AT
	(IDENT_DOT | IDENT | WS | NUMBER | REST | MINUS | PLUS | LPAREN | RPAREN | RBRACE | QUESTI | NOT | BAND | BOR | HASH | CARET | EQUALS | ESC_COLON | ESC_STRING | ESC_AT | ESC_LBRACE | ESC_RBRACE | ESC_HASH | ESC_BOR) 
		{add($parse::text);} sql[metaStatement]?
	| COLON ident=identifier 
		{addIdent(metaStatement, ident, $parse::text);} sql[metaStatement]?
     	| STRING cnst=constant 
     		{addConstant(metaStatement, cnst, $parse::text);} sql[metaStatement]?
     	| AT col=column 
     		{addColumn(metaStatement, col, $parse::text);$parse::hasOutputMapping=true;} sql[metaStatement]?
     	| LBRACE metaSql[metaStatement] RBRACE sql[metaStatement]?
     	;

metaSql [SqlMetaStatement metaStatement]
@init {SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; SqlMetaOrd metaOrd; SqlMetaSqlFragment sqlFragment; addText(metaStatement, $parse::text);}	
	:
	// except LBRACE RBRACE QUESTI BAND BOR HASH
	(IDENT_DOT | IDENT | WS | NUMBER | REST | COLON | STRING | MINUS | PLUS | LPAREN | RPAREN | NOT | AT | CARET | ESC_COLON | ESC_STRING | ESC_AT | ESC_LBRACE | ESC_RBRACE | ESC_HASH | ESC_BOR)
		{add($parse::text); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);} metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);})* {metaStatement.addElement(metaAndOr);}
	| QUESTI {metaIf = new SqlMetaIf(); } metaLogExpr=ifSqlCond {metaIf.setExpression(metaLogExpr);} 
		BOR metaIfItem=ifSql[null] {metaIf.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {metaIf.addElement(metaIfItem);})*
		 {metaStatement.addElement(metaIf);}
	| BAND {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);} metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);})* {metaStatement.addElement(metaAndOr);}
	| BOR {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);} metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);})* {metaStatement.addElement(metaAndOr);}
	| EQUALS WS* fragmentType=IDENT {sqlFragment = new SqlMetaSqlFragment(fragmentType.getText());} metaIfItem=ifSql[null] {sqlFragment.addElement(metaIfItem);} 
		{metaStatement.addElement(sqlFragment);}
	| HASH orderId=NUMBER {metaOrd = new SqlMetaOrd(Integer.parseInt(orderId.getText()));} ordSql[metaOrd] {metaStatement.addElement(metaOrd);}
	;
	
ifSql [SqlMetaIfItem metaIfItemIn] returns[SqlMetaIfItem metaIfItem]
@init {$metaIfItem = (metaIfItemIn !=null) ? metaIfItemIn : new SqlMetaIfItem();}
@after {addText(metaIfItem, $parse::text);}
	:
	// except LBRACE STRING COLON RBRACE BOR AT
	(IDENT_DOT | IDENT | WS | NUMBER | REST | MINUS | PLUS | LPAREN | RPAREN | QUESTI | NOT | BAND | HASH | CARET | EQUALS | ESC_COLON | ESC_STRING | ESC_AT | ESC_LBRACE | ESC_RBRACE | ESC_HASH | ESC_BOR)
		{add($parse::text);} ifSql[metaIfItem]?
	| COLON ident=identifier 
		{addIdent(metaIfItem, ident, $parse::text);} ifSql[metaIfItem]?
	| STRING cnst=constant 
		{addConstant(metaIfItem, cnst, $parse::text);} ifSql[metaIfItem]?
     	| AT col=column 
     		{addColumn(metaIfItem, col, $parse::text);$parse::hasOutputMapping=true;} ifSql[metaIfItem]?
	| LBRACE ifMetaSql[metaIfItem] RBRACE ifSql[metaIfItem]?
	;
     	
ifMetaSql [SqlMetaIfItem metaIfItem]
@init {SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; addText(metaIfItem, $parse::text);}	
	:
	// except LBRACE RBRACE QUESTI BAND BOR
	(IDENT_DOT | IDENT | WS |  NUMBER | REST | COLON | STRING | MINUS | PLUS | LPAREN | RPAREN | NOT | HASH | AT | CARET | EQUALS | ESC_COLON | ESC_STRING | ESC_AT | ESC_LBRACE | ESC_RBRACE | ESC_HASH | ESC_BOR)
		{add($parse::text); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);} metaIfItem2=ifSql[null] {metaAndOr.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {metaAndOr.addElement(metaIfItem2);})* {metaIfItem.addElement(metaAndOr);}
	| QUESTI {metaIf = new SqlMetaIf(); } metaLogExpr=ifSqlCond {metaIf.setExpression(metaLogExpr);} 
		BOR metaIfItem2=ifSql[null] {metaIf.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {metaIf.addElement(metaIfItem2);})*
		 {metaIfItem.addElement(metaIf);}
	| BAND {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);} metaIfItem2=ifSql[null] {metaAndOr.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {metaAndOr.addElement(metaIfItem2);})* {metaIfItem.addElement(metaAndOr);}
	| BOR {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);} metaIfItem2=ifSql[null] {metaAndOr.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {metaAndOr.addElement(metaIfItem2);})* {metaIfItem.addElement(metaAndOr);}
	;

ifSqlCond returns[SqlMetaLogExpr metaLogExpr]
@init {$metaLogExpr = new SqlMetaLogExpr();}
	:
	WS* ifSqlBool[metaLogExpr] WS* ((AND {addOperator(metaLogExpr,true);} | OR {addOperator(metaLogExpr,false);}) WS*
		ifSqlBool[metaLogExpr] WS*)*
	;
	
ifSqlBool [SqlMetaLogExpr metaLogExpr]
	:
	not=NOT? COLON ident=identifier {ident.setNot(not!=null); addIdent(metaLogExpr, ident, $parse::text);}
	| not=NOT? STRING cnst=constant {cnst.setNot(not!=null); addConstant(metaLogExpr, cnst, $parse::text);}
	| not=NOT? LPAREN newMetaLogExpr=ifSqlCond RPAREN {metaLogExpr.addElement(newMetaLogExpr);}
	;
	
ordSql [SqlMetaOrd ord]
@after {addText(ord, $parse::text);}
 	:	
	// except STRING COLON RBRACE
	(IDENT_DOT | IDENT | WS | NUMBER | REST | MINUS | PLUS | LPAREN | RPAREN | LBRACE | QUESTI | NOT | BAND | BOR | HASH | AT | CARET | EQUALS | ESC_COLON | ESC_STRING | ESC_AT | ESC_LBRACE | ESC_RBRACE | ESC_HASH | ESC_BOR)
		{add($parse::text);} ordSql[ord]?
	| COLON ident=identifier 
		{addIdent(ord, ident, $parse::text);} ordSql[ord]?
	| STRING cnst=constant
		{addConstant(ord, cnst, $parse::text);} ordSql[ord]?
	;	

column returns[SqlMappingItem result]
	:	
	(col=IDENT_DOT | col=IDENT)
		{$result = newColumn(col);}
		(options {greedy=true;} : CARET type=IDENT { setMetaType($parse::typeFactory, $result, $type.text); }
		 (options {greedy=true;} : CARET (value=IDENT (options {greedy=true;} :EQUALS value2=IDENT)? | value=NUMBER) { $result.setValues($value.text, $value2.text); }
		 )*
		)?
	;

constant returns [SqlMetaConst result]
	:	
	(caseCnst=PLUS | caseCnst=MINUS)? (cnst=IDENT_DOT | cnst=IDENT)
		{$result = newConstant(cnst, $caseCnst);}
		(options {greedy=true;} : CARET type=IDENT { setMetaType($parse::typeFactory, $result, $type.text); }
		 (options {greedy=true;} : CARET (value=IDENT (options {greedy=true;} :EQUALS value2=IDENT)? | value=NUMBER) { $result.setValues($value.text, $value2.text); }
		 )*
		)?
	;

identifier returns [SqlMetaIdent result]
	:	
	(caseIdent=PLUS | caseIdent=MINUS)? (ident=IDENT_DOT | ident=IDENT)
		{$result = newIdent($ident, $caseIdent);}
		(options {greedy=true;} : CARET type=IDENT { setMetaType($parse::typeFactory, $result, $type.text); }
		 (options {greedy=true;} : CARET (value=IDENT (options {greedy=true;} :EQUALS value2=IDENT)? | value=NUMBER) { $result.setValues($value.text, $value2.text); }
		 )*
		)?
	;


	
IDENT_DOT: IDENT (DOT IDENT)+;
IDENT: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '=')*;
NUMBER: DIGIT+;
fragment
DIGIT: ('0'..'9');
WS:    (' ' | '\t')+ ;
AND:   '&' '&' ;
OR:    '|' '|' ;

ESC_COLON:    '\\' ':' ;
ESC_STRING:   '\\' '$' ;
ESC_LBRACE:   '\\' '{' ;
ESC_RBRACE:   '\\' '}' ;
ESC_BOR:      '\\' '|' ;
ESC_HASH:     '\\' '#' ;
ESC_AT:	      '\\' '@';

COLON:    ':' ;
STRING:   '$' ;
fragment
DOT:      '.' ;
MINUS:    '-' ;
PLUS:     '+' ;
LPAREN:   '(' ;
RPAREN:   ')' ;
LBRACE:   '{' ;
RBRACE:   '}' ;
QUESTI:   '?' ;
NOT:      '!' ;
BAND:     '&' ;
BOR:      '|' ;
HASH:     '#' ;
AT:	  '@';
CARET:    '^';
EQUALS:   '=' ;
REST:     ~(COLON | STRING | MINUS | PLUS | LPAREN | RPAREN | LBRACE | RBRACE | QUESTI | NOT | BAND | BOR | HASH | AT | CARET | EQUALS);