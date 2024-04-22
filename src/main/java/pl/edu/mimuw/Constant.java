package pl.edu.mimuw;

public class Constant extends Expression{
    double fixedNumber;
    public Constant(double t){
        this.fixedNumber = t;
    }
    @Override
    public String toString(){
        return Double.toString(fixedNumber);
    }
    @Override
    public double evaluate(double x){
        return fixedNumber;
    }
}
