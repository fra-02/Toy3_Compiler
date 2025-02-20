package main.nodes.statements;

import main.nodes.declarations.VarDeclOp;
import main.visitor.Node;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class LetGoWhenOp extends Node implements StatementOp {

    private List<VarDeclOp> varDeclOpList;
    private List<WhenStmtOp> whenStmtOpList;
    private List<StatementOp>  otherwiseStmtList;
    private String funLabel;

    public LetGoWhenOp(List<VarDeclOp> varDeclOpList, List<WhenStmtOp> whenStmtOpList, List<StatementOp> otherwiseStmtList) {
        this.varDeclOpList = new ArrayList<>(varDeclOpList);
        this.whenStmtOpList = new ArrayList<>(whenStmtOpList);
        this.otherwiseStmtList = new ArrayList<>(otherwiseStmtList);
    }

    @Override
    public String toString() {
        return "LetGoWhenOp{" +
                "varDeclOpList=" + varDeclOpList +
                ", whenStmtOpList=" + whenStmtOpList +
                ", otherwiseStmtList=" + otherwiseStmtList +
                ", funLabel='" + funLabel + '\'' +
                '}';
    }

    public List<VarDeclOp> getVarDeclOpList() {
        return varDeclOpList;
    }

    public void setVarDeclOpList(List<VarDeclOp> varDeclOpList) {
        this.varDeclOpList = varDeclOpList;
    }

    public List<WhenStmtOp> getWhileStmtOpList() {
        return whenStmtOpList;
    }

    public void setWhileStmtOpList(List<WhenStmtOp> whenStmtOpList) {
        this.whenStmtOpList = whenStmtOpList;
    }

    public List<StatementOp> getOtherwiseStmtList() {
        return otherwiseStmtList;
    }

    public void setOtherwiseStmtList(List<StatementOp> otherwiseStmtList) {
        this.otherwiseStmtList = otherwiseStmtList;
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
