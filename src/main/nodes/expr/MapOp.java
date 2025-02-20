package main.nodes.expr;

import main.nodes.common.Identifier;
import main.visitor.Node;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MapOp extends Node implements ExprOp {

    private Op op;
    private Identifier fun;
    private List<ExprOp> exprList;

    public MapOp(Op op, Identifier fun, List<ExprOp> exprList) {
        this.op = op;
        this.fun = fun;
        this.exprList = new ArrayList<>(exprList);
    }

    public Op getOp() {
        return op;
    }

    public void setOp(Op op) {
        this.op = op;
    }

    public Identifier getFun() {
        return fun;
    }

    public void setFun(Identifier fun) {
        this.fun = fun;
    }

    public List<ExprOp> getExprList() {
        return exprList;
    }

    public void setExprList(List<ExprOp> exprList) {
        this.exprList = exprList;
    }

    @Override
    public String toString() {
        return "MapOp{" +
                "op=" + op +
                ", fun=" + fun +
                ", exprList=" + exprList +
                '}';
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
