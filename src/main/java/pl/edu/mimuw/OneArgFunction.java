package pl.edu.mimuw;

public abstract class OneArgFunction extends Expression {
    protected String functionName;
    protected Expression argument;

    @Override
    public String toString(){
        return functionName + '(' + argument.toString() + ')';
    }
}
