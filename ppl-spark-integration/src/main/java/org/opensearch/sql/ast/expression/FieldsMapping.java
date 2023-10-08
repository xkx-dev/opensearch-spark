package org.opensearch.sql.ast.expression;

import org.opensearch.sql.ast.AbstractNodeVisitor;

import java.util.List;

public class FieldsMapping extends UnresolvedExpression {


    private final List<UnresolvedExpression> fieldsMappingList;

    public <R> FieldsMapping(List<UnresolvedExpression> fieldsMappingList) {
        this.fieldsMappingList = fieldsMappingList;
    }

    @Override
    public <R, C> R accept(AbstractNodeVisitor<R, C> nodeVisitor, C context) {
        return nodeVisitor.visit(this, context);
    }
}
