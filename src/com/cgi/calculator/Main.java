package com.cgi.calculator;

public class Main {

    public static void main(String[] args) {
      MathsEquation[] equations = new MathsEquation[4];
      equations[0] = create(100.0d, 50.0d,'d');
      equations[1] = create(25.0d, 92.0d,'a');
      equations[2] = create(225.0d, 17.0d,'s');
      equations[3] = create(11.0d, 3.0d,'m');


     for (MathsEquation equation : equations) {
         equation.execute();
         System.out.print("results = ");
         System.out.println(equation.getResult());

     }

    }
    public static MathsEquation create(double leftVal, double rightVal, char opCode) {
        MathsEquation equation = new MathsEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
