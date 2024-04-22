package pl.edu.mimuw;

public class Addition extends BinaryOperator{

    public Addition(Expression first, Expression second){
        this.operatorChar = '+';
        this.operand1 = first;
        this.operand2 = second;
    }
    @Override
    public double evaluate(double x) {
        return this.operand1.evaluate(x) + this.operand2.evaluate(x);
    }
}
