package com.cgi.calculator;

public class MathsEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() { return rightVal; }
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public char getOpCode() { return opCode; }
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() {return result;}
    //empty constructor
    public MathsEquation(){}
    //opCode constructor which creates opcode
    public  MathsEquation(char opCode){
        this.opCode = opCode;
    }
    //value constructor
    public  MathsEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);//calls opCode constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }
public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
       execute();
    }
    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int)result;
    }
    //method below called execute when execute is called
 //depending on opCode will depend on equation
    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }

    }


}
