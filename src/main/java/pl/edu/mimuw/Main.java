package pl.edu.mimuw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Expression con = new Constant(2);
        System.out.println(con.toString());
        Expression fix = new Variable();
        System.out.println(fix.evaluate(5));
        System.out.println(fix.toString());
        Expression x = new Addition(fix, con);
        Expression y = new Substraction(fix, con);
        Expression z = new Multiplication(fix, con);
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
        System.out.println(x.evaluate(2));
        System.out.println(y.evaluate(2));
        System.out.println(z.evaluate(2));
        Expression sin = new Sin(fix);
        System.out.println(sin.toString());
        System.out.println(sin.evaluate(0));
        Expression sec = new UnaryNegative(sin);
        System.out.println(sec.toString());
        System.out.println(sec.evaluate(-30));
    }
}
