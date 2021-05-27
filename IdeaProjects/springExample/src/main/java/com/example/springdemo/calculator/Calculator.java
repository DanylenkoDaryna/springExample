package com.example.springdemo.calculator;

import java.util.List;
import java.util.Stack;

public class Calculator {

    private List<Expression> expressions;

    public Calculator(){
        expressions = new Stack<>();
    }

}

class Expression {

    double value1 = 0;
    double value2 = 0;
    double result = 0;

    char operation = '+';

    public Expression(){}

    protected void doOperation(int val1, int val2){

    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
}