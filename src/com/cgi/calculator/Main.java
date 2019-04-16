package com.cgi.calculator;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};//ARRAY
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};//ARRAY
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

      MathsEquation[] equations = new MathsEquation[4];
      equations[0] = create(100.0d, 50,'d');
      equations[0] = new MathsEquation();
     for (MathsEquation equation : equations) {
         equation.execute();

         System.out.print("results = ");
         System.out.println(equation.result);

     }

    }
    public static MathsEquation create(double leftVal, double rightVal, char opCode) {
        MathsEquation equation = new MathsEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }
}
