
package main.nodes.program;

import main.nodes.declarations.VarDeclOp;
import main.visitor.Visitor;
import main.visitor.Node;
import java.util.ArrayList;
import java.util.List;

public class ProgramOp extends Node {

    private List<Object> listDecls;
    private BeginEndOp beginEndOp;
    private List<VarDeclOp> letDecls = new ArrayList<>();

    public ProgramOp(List<Object> listDecls, BeginEndOp beginEndOp) {
        this.listDecls = new ArrayList<>(listDecls);
        this.beginEndOp = beginEndOp;
    }

    public List<Object> getListDecls() {
        return listDecls;
    }

    public BeginEndOp getBeginEndOp() {
        return beginEndOp;
    }

    public void setBeginEndOp(BeginEndOp beginEndOp) {
        this.beginEndOp = beginEndOp;
    }

    public void setListDecls(List<Object> listDecls) {
        this.listDecls = listDecls;
    }



    public List<VarDeclOp> getLetDecls() {
        return letDecls;
    }

    public void setLetDecls(List<VarDeclOp> letDecls) {
        this.letDecls = letDecls;
    }

    @Override
    public String toString() {
        return "ProgramOp{ "+
            "listDecls= " + listDecls +
            ", beginBeginEndOp= " + beginEndOp +
            " }";
    }



    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
