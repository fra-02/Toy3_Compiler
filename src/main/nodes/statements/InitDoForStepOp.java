package main.nodes.statements;

import main.nodes.declarations.VarDeclOp;
import main.nodes.expr.ExprOp;
import main.visitor.Visitor;
import main.visitor.Node;

import java.util.ArrayList;
import java.util.List;

public class InitDoForStepOp extends Node implements StatementOp {
    private List<VarDeclOp> varDeclList;
    private List<StatementOp> stmtList;
    private ExprOp condition;
    private AssignOp assignStmt;
    private String funLabel;

    public InitDoForStepOp(List<VarDeclOp> varDeclList, AssignOp assignStmt, ExprOp condition, List<StatementOp> stmtList) {
        this.varDeclList = new ArrayList<>(varDeclList);
        this.assignStmt = assignStmt;
        this.condition = condition;
        this.stmtList = new ArrayList<>(stmtList);
    }

    public List<VarDeclOp> getVarDeclList() {
        return varDeclList;
    }

    public void setVarDeclList(List<VarDeclOp> varDeclList) {
        this.varDeclList = varDeclList;
    }

    public AssignOp getAssignStmt() {
        return assignStmt;
    }

    public void setAssignStmt(AssignOp assignStmt) {
        this.assignStmt = assignStmt;
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

    @Override
    public String toString() {
        return "InitDoForStepOp{" +
                "varDeclList=" + varDeclList +
                ", stmtList=" + stmtList +
                ", condition=" + condition +
                ", assignStmt=" + assignStmt +
                ", funLabel='" + funLabel + '\'' +
                '}';
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
