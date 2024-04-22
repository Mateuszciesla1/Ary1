package pl.edu.mimuw;

public class UnaryNegative extends UnaryOperator{
    public UnaryNegative(Expression first){
        this.operand = first;
        this.operatorChar = '-';
    }
    @Override
    public double evaluate(double x){
        return -operand.evaluate(x);
    }

}
