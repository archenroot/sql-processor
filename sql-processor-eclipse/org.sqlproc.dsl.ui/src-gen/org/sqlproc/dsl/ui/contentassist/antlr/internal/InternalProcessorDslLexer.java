package org.sqlproc.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProcessorDslLexer extends Lexer {
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_SEMICOLON=36;
    public static final int RULE_PERCENT=27;
    public static final int RULE_OR=29;
    public static final int RULE_OPTION_TYPE=34;
    public static final int RULE_AND=28;
    public static final int RULE__NUMBER=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_NOT=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_REST=6;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_LPAREN=13;
    public static final int T__59=59;
    public static final int RULE_LBRACE=15;
    public static final int RULE_BOR=20;
    public static final int RULE_IDENT_DOT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int RULE_BAND=19;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RBRACE=16;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CARET=23;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_MORE_THAN=26;
    public static final int RULE_PLUS=12;
    public static final int RULE_STATEMEN_TYPE=32;
    public static final int RULE_COMMA=10;
    public static final int RULE_HASH=21;
    public static final int RULE_QUESTI=17;
    public static final int RULE_SL_COMMENT=38;
    public static final int RULE_ML_COMMENT=37;
    public static final int RULE_ON_OFF=31;
    public static final int RULE_MINUS=11;
    public static final int RULE_COLON=8;
    public static final int RULE_STRING=9;
    public static final int RULE_ESC_CHAR=30;
    public static final int RULE_IDENT=4;
    public static final int T__39=39;
    public static final int RULE_EQUALS=24;
    public static final int RULE_RPAREN=14;
    public static final int RULE_LESS_THAN=25;
    public static final int RULE_WS=35;
    public static final int RULE_MAPPING_TYPE=33;
    public static final int RULE_AT=22;

    // delegates
    // delegators

    public InternalProcessorDslLexer() {;} 
    public InternalProcessorDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProcessorDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:7: ( 'byte' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:7: ( 'short' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:7: ( 'int' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:7: ( 'long' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:7: ( 'float' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:7: ( 'double' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:7: ( 'boolean' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:7: ( 'package' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:7: ( 'import' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:7: ( 'pojo' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:9: 'pojo'
            {
            match("pojo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:7: ( 'extends' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:7: ( '.*' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:7: ( 'col' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:7: ( 'ident' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:9: 'ident'
            {
            match("ident"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:7: ( 'const' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:7: ( 'out' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:7: ( 'table' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:7: ( 'dbcol' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:9: 'dbcol'
            {
            match("dbcol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:7: ( 'prefix' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:7: ( 'abstract' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:7: ( 'resolve references' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:9: 'resolve references'
            {
            match("resolve references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:7: ( 'database online' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:9: 'database online'
            {
            match("database online"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:7: ( 'database url' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:9: 'database url'
            {
            match("database url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:7: ( 'database username' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:9: 'database username'
            {
            match("database username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:7: ( 'database password' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:9: 'database password'
            {
            match("database password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:7: ( 'database schema' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:9: 'database schema'
            {
            match("database schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:7: ( 'database driver' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:9: 'database driver'
            {
            match("database driver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_ON_OFF"
    public final void mRULE_ON_OFF() throws RecognitionException {
        try {
            int _type = RULE_ON_OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14995:13: ( ( 'ON' | 'OFF' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14995:15: ( 'ON' | 'OFF' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14995:15: ( 'ON' | 'OFF' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='N') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='F') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14995:16: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14995:21: 'OFF'
                    {
                    match("OFF"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ON_OFF"

    // $ANTLR start "RULE_STATEMEN_TYPE"
    public final void mRULE_STATEMEN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_STATEMEN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14997:20: ( ( 'QRY' | 'CRUD' | 'CALL' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14997:22: ( 'QRY' | 'CRUD' | 'CALL' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14997:22: ( 'QRY' | 'CRUD' | 'CALL' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='Q') ) {
                alt2=1;
            }
            else if ( (LA2_0=='C') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='R') ) {
                    alt2=2;
                }
                else if ( (LA2_2=='A') ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14997:23: 'QRY'
                    {
                    match("QRY"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14997:29: 'CRUD'
                    {
                    match("CRUD"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14997:36: 'CALL'
                    {
                    match("CALL"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMEN_TYPE"

    // $ANTLR start "RULE_MAPPING_TYPE"
    public final void mRULE_MAPPING_TYPE() throws RecognitionException {
        try {
            int _type = RULE_MAPPING_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14999:19: ( 'OUT' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14999:21: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAPPING_TYPE"

    // $ANTLR start "RULE_OPTION_TYPE"
    public final void mRULE_OPTION_TYPE() throws RecognitionException {
        try {
            int _type = RULE_OPTION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:18: ( ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt3=1;
                }
                break;
            case 'L':
                {
                alt3=2;
                }
                break;
            case 'I':
                {
                alt3=3;
                }
                break;
            case 'S':
                {
                alt3=4;
                }
                break;
            case 'B':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:21: 'OPT'
                    {
                    match("OPT"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:27: 'LOPT'
                    {
                    match("LOPT"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:34: 'IOPT'
                    {
                    match("IOPT"); 


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:41: 'SOPT'
                    {
                    match("SOPT"); 


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15001:48: 'BOPT'
                    {
                    match("BOPT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPTION_TYPE"

    // $ANTLR start "RULE_IDENT_DOT"
    public final void mRULE_IDENT_DOT() throws RecognitionException {
        try {
            int _type = RULE_IDENT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15003:16: ( RULE_IDENT ( '.' RULE_IDENT )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15003:18: RULE_IDENT ( '.' RULE_IDENT )+
            {
            mRULE_IDENT(); 
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15003:29: ( '.' RULE_IDENT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15003:30: '.' RULE_IDENT
            	    {
            	    match('.'); 
            	    mRULE_IDENT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT_DOT"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15005:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )* )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15005:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15005:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='='||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE__NUMBER"
    public final void mRULE__NUMBER() throws RecognitionException {
        try {
            int _type = RULE__NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15007:14: ( ( '0' .. '9' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15007:16: ( '0' .. '9' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15007:16: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15007:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__NUMBER"

    // $ANTLR start "RULE_ESC_CHAR"
    public final void mRULE_ESC_CHAR() throws RecognitionException {
        try {
            int _type = RULE_ESC_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15009:15: ( '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '/' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15009:17: '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '/' )
            {
            match('\\'); 
            if ( (input.LA(1)>='#' && input.LA(1)<='%')||input.LA(1)=='/'||(input.LA(1)>=':' && input.LA(1)<=';')||input.LA(1)=='@'||(input.LA(1)>='{' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC_CHAR"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15011:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15011:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15011:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15011:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:41: ( '\\r' )? '\\n'
                    {
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15013:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15015:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15015:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15015:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15017:10: ( '&' '&' '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15017:12: '&' '&' '&'
            {
            match('&'); 
            match('&'); 
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15019:9: ( '|' '|' '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15019:11: '|' '|' '|'
            {
            match('|'); 
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15021:12: ( ':' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15021:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15023:16: ( ';' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15023:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15025:13: ( '$' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15025:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15027:12: ( ',' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15027:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15029:12: ( '-' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15029:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15031:11: ( '+' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15031:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15033:13: ( '(' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15033:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15035:13: ( ')' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15035:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15037:13: ( '{' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15037:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15039:13: ( '}' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15039:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_QUESTI"
    public final void mRULE_QUESTI() throws RecognitionException {
        try {
            int _type = RULE_QUESTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15041:13: ( '?' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15041:15: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTI"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15043:10: ( '!' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15043:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_BAND"
    public final void mRULE_BAND() throws RecognitionException {
        try {
            int _type = RULE_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15045:11: ( '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15045:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAND"

    // $ANTLR start "RULE_BOR"
    public final void mRULE_BOR() throws RecognitionException {
        try {
            int _type = RULE_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15047:10: ( '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15047:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOR"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15049:11: ( '#' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15049:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15051:9: ( '@' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15051:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15053:12: ( '^' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15053:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15055:13: ( '=' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15055:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_LESS_THAN"
    public final void mRULE_LESS_THAN() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15057:16: ( '<' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15057:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN"

    // $ANTLR start "RULE_MORE_THAN"
    public final void mRULE_MORE_THAN() throws RecognitionException {
        try {
            int _type = RULE_MORE_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15059:16: ( '>' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15059:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MORE_THAN"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15061:14: ( '%' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15061:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_REST"
    public final void mRULE_REST() throws RecognitionException {
        try {
            int _type = RULE_REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15063:11: (~ ( RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15063:13: ~ ( RULE_SEMICOLON )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REST"

    public void mTokens() throws RecognitionException {
        // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE__NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST )
        int alt12=62;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:172: RULE_ON_OFF
                {
                mRULE_ON_OFF(); 

                }
                break;
            case 29 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:184: RULE_STATEMEN_TYPE
                {
                mRULE_STATEMEN_TYPE(); 

                }
                break;
            case 30 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:203: RULE_MAPPING_TYPE
                {
                mRULE_MAPPING_TYPE(); 

                }
                break;
            case 31 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:221: RULE_OPTION_TYPE
                {
                mRULE_OPTION_TYPE(); 

                }
                break;
            case 32 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:238: RULE_IDENT_DOT
                {
                mRULE_IDENT_DOT(); 

                }
                break;
            case 33 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:253: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 34 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:264: RULE__NUMBER
                {
                mRULE__NUMBER(); 

                }
                break;
            case 35 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:277: RULE_ESC_CHAR
                {
                mRULE_ESC_CHAR(); 

                }
                break;
            case 36 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:291: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:307: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:323: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:331: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 40 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:340: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 41 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:348: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 42 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:359: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 43 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:374: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:386: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 45 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:397: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 46 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:408: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 47 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:418: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 48 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:430: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 49 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:442: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 50 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:454: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 51 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:466: RULE_QUESTI
                {
                mRULE_QUESTI(); 

                }
                break;
            case 52 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:478: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 53 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:487: RULE_BAND
                {
                mRULE_BAND(); 

                }
                break;
            case 54 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:497: RULE_BOR
                {
                mRULE_BOR(); 

                }
                break;
            case 55 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:506: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 56 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:516: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 57 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:524: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 58 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:535: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 59 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:547: RULE_LESS_THAN
                {
                mRULE_LESS_THAN(); 

                }
                break;
            case 60 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:562: RULE_MORE_THAN
                {
                mRULE_MORE_THAN(); 

                }
                break;
            case 61 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:577: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 62 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:590: RULE_REST
                {
                mRULE_REST(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\64\1\60\15\64\1\uffff\2\60\1\uffff\1\132\1\134\24\uffff"+
        "\3\64\2\uffff\15\64\1\uffff\5\64\1\u0084\12\64\33\uffff\3\64\1\u0092"+
        "\13\64\1\u009e\1\64\1\u00a0\3\64\1\uffff\1\u0084\1\u00a4\1\u00a5"+
        "\1\u00a6\6\64\1\u00ad\2\64\1\uffff\2\64\1\u00b2\5\64\1\u00b8\2\64"+
        "\1\uffff\1\64\1\uffff\3\64\3\uffff\2\u00a6\4\u00a5\1\uffff\1\64"+
        "\1\u00c0\1\64\1\u00c2\1\uffff\1\u00c3\1\64\1\u00c5\2\64\1\uffff"+
        "\2\64\1\u00ca\1\u00cb\3\64\1\uffff\1\u00cf\2\uffff\1\u00d0\1\uffff"+
        "\2\64\1\u00d3\1\64\2\uffff\2\64\1\u00d7\2\uffff\1\64\1\u00d9\1\uffff"+
        "\1\u00da\2\64\1\uffff\1\64\2\uffff\1\u00de\12\uffff";
    static final String DFA12_eofS =
        "\u00e6\uffff";
    static final String DFA12_minS =
        "\1\0\10\56\1\52\15\56\1\uffff\1\43\1\52\1\uffff\1\46\1\174\24\uffff"+
        "\3\56\2\uffff\15\56\1\uffff\20\56\33\uffff\25\56\1\uffff\15\56\1"+
        "\uffff\13\56\1\uffff\1\56\1\uffff\3\56\3\uffff\6\56\1\uffff\4\56"+
        "\1\uffff\5\56\1\uffff\7\56\1\uffff\1\56\2\uffff\1\56\1\uffff\4\56"+
        "\2\uffff\3\56\2\uffff\2\56\1\uffff\2\56\1\40\1\uffff\1\40\2\uffff"+
        "\1\56\1\uffff\1\144\2\uffff\1\162\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\10\172\1\52\15\172\1\uffff\1\175\1\57\1\uffff\1\46\1\174"+
        "\24\uffff\3\172\2\uffff\15\172\1\uffff\20\172\33\uffff\25\172\1"+
        "\uffff\15\172\1\uffff\13\172\1\uffff\1\172\1\uffff\3\172\3\uffff"+
        "\6\172\1\uffff\4\172\1\uffff\5\172\1\uffff\7\172\1\uffff\1\172\2"+
        "\uffff\1\172\1\uffff\4\172\2\uffff\3\172\2\uffff\2\172\1\uffff\3"+
        "\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\165\2\uffff\1\163\5\uffff";
    static final String DFA12_acceptS =
        "\27\uffff\1\42\2\uffff\1\46\2\uffff\1\51\1\52\1\53\1\54\1\55\1\56"+
        "\1\57\1\60\1\61\1\62\1\63\1\64\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
        "\1\76\3\uffff\1\41\1\40\15\uffff\1\14\20\uffff\1\42\1\43\1\44\1"+
        "\45\1\46\1\47\1\65\1\50\1\66\1\51\1\53\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\63\1\64\1\67\1\70\1\71\1\72\1\73\1\74\1\75\25\uffff"+
        "\1\34\15\uffff\1\3\13\uffff\1\15\1\uffff\1\20\3\uffff\1\36\1\37"+
        "\1\35\6\uffff\1\1\4\uffff\1\4\5\uffff\1\12\7\uffff\1\2\1\uffff\1"+
        "\16\1\5\1\uffff\1\22\4\uffff\1\17\1\21\3\uffff\1\11\1\6\2\uffff"+
        "\1\23\3\uffff\1\7\1\uffff\1\10\1\13\1\uffff\1\25\1\uffff\1\24\1"+
        "\26\1\uffff\1\31\1\32\1\33\1\27\1\30";
    static final String DFA12_specialS =
        "\1\0\u00e5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\60\2\32\2\60\1\32\22\60\1\32\1\50\1\60\1\51\1\37\1\57\1"+
            "\33\1\60\1\43\1\44\1\60\1\42\1\40\1\41\1\11\1\31\12\27\1\35"+
            "\1\36\1\55\1\54\1\56\1\47\1\52\1\26\1\25\1\21\5\26\1\23\2\26"+
            "\1\22\2\26\1\17\1\26\1\20\1\26\1\24\7\26\1\60\1\30\1\60\1\53"+
            "\2\60\1\15\1\1\1\12\1\6\1\10\1\5\2\26\1\3\2\26\1\4\2\26\1\13"+
            "\1\7\1\26\1\16\1\2\1\14\6\26\1\45\1\34\1\46\uff82\60",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\62\11\63\1\61\1\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\7\63\1\66\22\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\3\63\1\71\10\63\1\70\1\67\14\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\72\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\73\16\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\76\1\75\14\63\1\74\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\77\15\63\1\100\2\63\1\101\10\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\27\63\1\102\2\63",
            "\1\103",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\104\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\24\63\1\105\5\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\106\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\63\1\107\30\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\110\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\5\63\1\112\7\63\1"+
            "\111\1\63\1\114\4\63\1\113\5\63\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\21\63\1\115\10\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\1\117\20\63\1\116"+
            "\10\63\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\16\63\1\120\13\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\16\63\1\121\13\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\16\63\1\122\13\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\16\63\1\123\13\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\3\125\11\uffff\1\125\12\uffff\2\125\4\uffff\1\125\72\uffff"+
            "\3\125",
            "\1\126\4\uffff\1\127",
            "",
            "\1\131",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\157\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\160\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\161\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\162\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\17\63\1\163\12\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\164\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\15\63\1\165\14\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\166\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\24\63\1\167\5\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\2\63\1\170\27\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\171\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\2\63\1\172\27\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\11\63\1\173\20\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\174\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\175\6\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\176\1\63\1\177\14\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u0080\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\63\1\u0081\30\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\u0082\7\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\u0083\7\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\5\63\1\u0085\24\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\23\63\1\u0086\6\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\23\63\1\u0087\6\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\30\63\1\u0088\1\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\24\63\1\u0089\5\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\13\63\1\u008a\16\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\17\63\1\u008b\12\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\17\63\1\u008c\12\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\17\63\1\u008d\12\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\17\63\1\u008e\12\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u008f\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\u0090\16\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\21\63\1\u0091\10\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\u0093\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\15\63\1\u0094\14\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\6\63\1\u0095\23\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\u0096\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\63\1\u0097\30\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\u0098\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\u0099\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\12\63\1\u009a\17\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\u009b\13\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\5\63\1\u009c\24\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u009d\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\u009f\7\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\u00a1\16\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00a2\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\16\63\1\u00a3\13\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\3\63\1\u00a7\26\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\13\63\1\u00a8\16\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\23\63\1\u00a9\6\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\23\63\1\u00aa\6\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\23\63\1\u00ab\6\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\23\63\1\u00ac\6\63"+
            "\4\uffff\1\63\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u00ae\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00af\6\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\21\63\1\u00b0\10\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00b1\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00b3\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\u00b4\16\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\u00b5\16\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\63\1\u00b6\30\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\u00b7\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\10\63\1\u00b9\21\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\15\63\1\u00ba\14\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00bb\6\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u00bc\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\21\63\1\u00bd\10\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\13\63\1\u00be\16\63",
            "",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\u00bf\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00c1\6\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u00c4\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\u00c6\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\6\63\1\u00c7\23\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\27\63\1\u00c8\2\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\3\63\1\u00c9\26\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\1\u00cc\31\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\25\63\1\u00cd\4\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\15\63\1\u00ce\14\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\u00d1\7\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u00d2\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\u00d4\7\63",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\2\63\1\u00d5\27\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u00d6\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\4\63\1\u00d8\25\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\23\63\1\u00db\6\63",
            "\1\u00dc\15\uffff\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32"+
            "\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00dd\15\uffff\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32"+
            "\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\65\1\uffff\12\63\3\uffff\1\63\3\uffff\32\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "",
            "\1\u00e3\12\uffff\1\u00df\1\u00e1\2\uffff\1\u00e2\1\uffff\1"+
            "\u00e0",
            "",
            "",
            "\1\u00e4\1\u00e5",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE__NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='b') ) {s = 1;}

                        else if ( (LA12_0=='s') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='l') ) {s = 4;}

                        else if ( (LA12_0=='f') ) {s = 5;}

                        else if ( (LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='p') ) {s = 7;}

                        else if ( (LA12_0=='e') ) {s = 8;}

                        else if ( (LA12_0=='.') ) {s = 9;}

                        else if ( (LA12_0=='c') ) {s = 10;}

                        else if ( (LA12_0=='o') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='a') ) {s = 13;}

                        else if ( (LA12_0=='r') ) {s = 14;}

                        else if ( (LA12_0=='O') ) {s = 15;}

                        else if ( (LA12_0=='Q') ) {s = 16;}

                        else if ( (LA12_0=='C') ) {s = 17;}

                        else if ( (LA12_0=='L') ) {s = 18;}

                        else if ( (LA12_0=='I') ) {s = 19;}

                        else if ( (LA12_0=='S') ) {s = 20;}

                        else if ( (LA12_0=='B') ) {s = 21;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||LA12_0=='P'||LA12_0=='R'||(LA12_0>='T' && LA12_0<='Z')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 22;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 23;}

                        else if ( (LA12_0=='\\') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( (LA12_0=='&') ) {s = 27;}

                        else if ( (LA12_0=='|') ) {s = 28;}

                        else if ( (LA12_0==':') ) {s = 29;}

                        else if ( (LA12_0==';') ) {s = 30;}

                        else if ( (LA12_0=='$') ) {s = 31;}

                        else if ( (LA12_0==',') ) {s = 32;}

                        else if ( (LA12_0=='-') ) {s = 33;}

                        else if ( (LA12_0=='+') ) {s = 34;}

                        else if ( (LA12_0=='(') ) {s = 35;}

                        else if ( (LA12_0==')') ) {s = 36;}

                        else if ( (LA12_0=='{') ) {s = 37;}

                        else if ( (LA12_0=='}') ) {s = 38;}

                        else if ( (LA12_0=='?') ) {s = 39;}

                        else if ( (LA12_0=='!') ) {s = 40;}

                        else if ( (LA12_0=='#') ) {s = 41;}

                        else if ( (LA12_0=='@') ) {s = 42;}

                        else if ( (LA12_0=='^') ) {s = 43;}

                        else if ( (LA12_0=='=') ) {s = 44;}

                        else if ( (LA12_0=='<') ) {s = 45;}

                        else if ( (LA12_0=='>') ) {s = 46;}

                        else if ( (LA12_0=='%') ) {s = 47;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='\"'||LA12_0=='\''||LA12_0=='*'||LA12_0=='['||LA12_0==']'||(LA12_0>='_' && LA12_0<='`')||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}