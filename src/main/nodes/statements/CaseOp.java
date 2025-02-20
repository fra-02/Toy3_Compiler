package main.nodes.statements;

import main.nodes.expr.ExprOp;
import main.nodes.types.ConstOp;
import main.visitor.Node;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CaseOp extends Node implements StatementOp {

    private ExprOp expr;
    private List<StatementOp> stmtList;
    private String funLabel;

    public CaseOp(ExprOp expr, List<StatementOp> stmtList) {
        this.expr = expr;
        this.stmtList = new ArrayList<>(stmtList);
    }

    public ExprOp getExpr() {
        return expr;
    }

    public void setExpr(ExprOp expr) {
        this.expr = expr;
    }

    public List<StatementOp> getStmtList() {
        return stmtList;
    }

    public void setStmtList(List<StatementOp> stmtList) {
        this.stmtList = stmtList;
    }

    @Override
    public String toString() {
        return "CaseOp{" +
                "expr=" + expr +
                ", stmtList=" + stmtList +
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
