package com.example.springdemo.calculator;



import org.junit.jupiter.api.Test;
import org.springframework.expression.spel.ast.Operator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
     void test1(){

        int value1 = 0;
        int value2 = 0;
        int result = 0;

        char operation = '+';
        assert(value1==2);
        assert(value2==6);

        assert(operation=='+');

        Expression expr = new Expression();
        expr.doOperation(value1,value2);

        assert(expr.getResult()==12);


    }


}