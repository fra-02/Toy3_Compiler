package main.nodes.statements;

import main.nodes.declarations.VarDeclOp;
import main.visitor.Node;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class LetInOp extends Node implements StatementOp {

    private List<VarDeclOp> varDeclOpList;
    private List<StatementOp> statementOpList;
    private String funLabel;

    public LetInOp(List<VarDeclOp> varDeclOpList, List<StatementOp> statementOpList) {
        this.varDeclOpList = new ArrayList<>(varDeclOpList);
        this.statementOpList = new ArrayList<>(statementOpList);
    }

    public List<VarDeclOp> getVarDeclOpList() {
        return varDeclOpList;
    }

    public void setVarDeclOpList(List<VarDeclOp> varDeclOpList) {
        this.varDeclOpList = varDeclOpList;
    }

    public List<StatementOp> getStatementOpList() {
        return statementOpList;
    }

    public void setStatementOpList(List<StatementOp> statementOpList) {
        this.statementOpList = statementOpList;
    }

    @Override
    public String toString() {
        return "LetInOp{" +
                "varDeclOpList=" + varDeclOpList +
                ", statementOpList=" + statementOpList +
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
