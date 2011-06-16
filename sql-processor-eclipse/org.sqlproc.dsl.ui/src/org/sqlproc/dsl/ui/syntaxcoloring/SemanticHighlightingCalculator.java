package org.sqlproc.dsl.ui.syntaxcoloring;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.util.NodeTreeIterator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.ColumnUsage;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.MappingIdentifier;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PojoDefinition;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        if (resource == null)
            return;

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while (iter.hasNext()) {
            EObject current = iter.next();
            if (current instanceof MetaStatement) {
                MetaStatement statement = (MetaStatement) current;
                if (statement.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev statementu je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), statement.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForFilters(statement.getFilters(), node, acceptor);
                }
            } else if (current instanceof MappingRule) {
                MappingRule rule = (MappingRule) current;
                if (rule.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev pravidla je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), rule.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForFilters(rule.getFilters(), node, acceptor);
                }
            } else if (current instanceof OptionalFeature) {
                OptionalFeature feature = (OptionalFeature) current;
                if (feature.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev vlastnosti je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), feature.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForFilters(feature.getFilters(), node, acceptor);
                }
            } else if (current instanceof Constant) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.CONSTANT);
            } else if (current instanceof Identifier) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.IDENTIFIER);
            } else if (current instanceof Column) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.COLUMN);
            } else if (current instanceof MappingIdentifier) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.IDENTIFIER);
            } else if (current instanceof PojoDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoDefinition pojo = (PojoDefinition) current;
                provideHighlightingForPojo(null, pojo.getName(), node, acceptor);
            } else if (current instanceof ColumnUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ColumnUsage usage = (ColumnUsage) current;
                MetaStatement statement = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojo(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof IdentifierUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                IdentifierUsage usage = (IdentifierUsage) current;
                MetaStatement statement = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojo(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof ConstantUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ConstantUsage usage = (ConstantUsage) current;
                MetaStatement statement = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojo(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof MappingUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                MappingUsage usage = (MappingUsage) current;
                MappingRule rule = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (rule != null && pojo != null)
                    provideHighlightingForPojo(rule.getName(), pojo.getName(), node, acceptor);
            }
        }
    }

    private void provideHighlightingForFilters(EList<String> filters, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (filters != null && !filters.isEmpty()) {
            int count = filters.size();
            Iterator<INode> iterator = new NodeTreeIterator(node);
            while (iterator.hasNext()) {
                INode inode = iterator.next();
                if (filters.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.FILTER);
                    if (--count <= 0)
                        return;
                }
            }
        }
    }

    private void provideHighlightingForPojo(String name, String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (pojo == null)
                    return;
            }
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }
}
