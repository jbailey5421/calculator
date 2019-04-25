package com.cgi.calculator.myapp;


import com.cgi.calculator.calculator.Adder;
import com.cgi.calculator.calculator.CalculateBase;
import com.cgi.calculator.calculator.Divider;
import com.cgi.calculator.calculator.DynamicHelper;
import com.cgi.calculator.calculator.MathProcessing;
import com.cgi.calculator.calculator.MathsEquation;
import com.cgi.calculator.calculator.Multiplier;
import com.cgi.calculator.calculator.PowerOf;
import com.cgi.calculator.calculator.Subtracter;

public class Main {

    public static void main(String[] args) {

    String[] statements = {
        "add 25.0 92.0",
        "power 5.0 2.0",
        "divide 250.0 50.0",
        "multiply 100.0 10.0",
        "subtract 50.0 150.0"
    };
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
            new Adder(),
            new PowerOf(),
            new Divider(),
            new Multiplier(),
            new Subtracter()
        });
    for(String statement:statements){
        String output = helper.process(statement);
        System.out.println(output);
    }
    //CalculateHelper helperl = new CalculateHelper();


        MathsEquation[] equations = new MathsEquation[4];
        equations[0] = new MathsEquation('d', 100.0d, 50.0d);
        equations[1] = new MathsEquation('a', 25.0d, 92.0d);
        equations[2] = new MathsEquation('s', 225.0d, 17.0d);
        equations[3] = new MathsEquation('m', 11.0d, 3.0d);


        for (MathsEquation equation : equations) {
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.getResult());

        }
        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;
        MathsEquation equationOverload = new MathsEquation('d');


        equationOverload.execute(leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());


        equationOverload.execute((double)leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());


        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calcualtors = {
                new Divider(100.0D, 50.0D),
                new Adder(25.0D, 92.0D),
                new Subtracter(225.0D, 17.0D),
                new Multiplier(11.0D, 3.0D)
        };

        for(CalculateBase calculator:calcualtors) {
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());

        }
    }
}
