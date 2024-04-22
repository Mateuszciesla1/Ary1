package pl.edu.mimuw;

public class Sin extends OneArgFunction {
    public Sin(Expression arg){
        argument = arg;
        this.functionName = "sin";
    }
    @Override
    public double evaluate(double x){
        return Math.sin(x);
    }
}
