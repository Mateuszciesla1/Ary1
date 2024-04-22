package pl.edu.mimuw;

public abstract class UnaryOperator extends Expression{
    protected Expression operand;
    protected char operatorChar;

    @Override
    public String toString(){
        return operatorChar + operand.toString();
    }
}
