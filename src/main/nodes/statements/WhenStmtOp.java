package main.nodes.statements;

import main.nodes.expr.ExprOp;
import main.visitor.Node;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class WhenStmtOp extends Node implements StatementOp {

    private ExprOp condition;
    private List<StatementOp> stmtList;
    private String funLabel;

    public WhenStmtOp(ExprOp condition, List<StatementOp> stmtList) {
        this.condition = condition;
        this.stmtList = new ArrayList<>(stmtList);
    }

    @Override
    public String toString() {
        return "WhenStmtOp{" +
                "condition=" + condition +
                ", stmtList=" + stmtList +
                ", funLabel='" + funLabel + '\'' +
                '}';
    }

    public ExprOp getCondition() {
        return condition;
    }

    public void setCondition(ExprOp condition) {
        this.condition = condition;
    }

    public List<StatementOp> getStmtList() {
        return stmtList;
    }

    public void setStmtList(List<StatementOp> stmtList) {
        this.stmtList = stmtList;
    }

    public void setFunLabel(String funLabel) {
        this.funLabel = funLabel;
    }

    public String getFunLabel() {
        return funLabel;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
