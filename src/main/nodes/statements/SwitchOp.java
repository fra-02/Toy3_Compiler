package main.nodes.statements;

import main.nodes.expr.ExprOp;
import main.visitor.Node;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class SwitchOp extends Node implements StatementOp {

    private ExprOp expr;
    private List<CaseOp> caseList;
    private String funLabel;

    public SwitchOp(ExprOp expr, List<CaseOp> caseList) {
        this.expr = expr;
        this.caseList = new ArrayList<>(caseList);
    }

    public ExprOp getExpr() {
        return expr;
    }

    public void setExpr(ExprOp expr) {
        this.expr = expr;
    }

    public List<CaseOp> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<CaseOp> caseList) {
        this.caseList = caseList;
    }

    @Override
    public String toString() {
        return "SwitchOp{" +
                "expr=" + expr +
                ", caseList=" + caseList +
                ", funLabel='" + funLabel + '\'' +
                '}';
    }

    @Override
    public void setFunLabel(String funLabel) {
        this.funLabel = funLabel;
    }

    @Override
    public String getFunLabel() {
        return funLabel;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
