package main.nodes.expr;

public enum Op {
    MUL, ADD;

    public String convertOp() {
        return switch (this) {
            case MUL -> "*";
            case ADD -> "+";
            default -> "unknown";
        };
    }
}
