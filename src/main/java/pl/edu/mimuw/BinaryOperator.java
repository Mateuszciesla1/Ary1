package pl.edu.mimuw;

 public abstract class BinaryOperator extends Expression{
     protected char operatorChar;
     protected Expression operand1, operand2;
     @Override
     public String toString(){
         return operand1.toString() + ' ' +  operatorChar + ' ' + operand2.toString();
     }

}

