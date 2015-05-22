package com.home.lambda.Impl;

import com.home.lambda.interfaces.Calculator;
import com.home.lambda.interfaces.PrintHello;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = (v1,v2) -> 
        {
            int result = v1 + v2;
            return result;
        };
        
        System.out.println(calculator.calculateSum(10, 20));
        
        PrintHello printHello = () -> System.out.println("Hello");
        printHello.printHello();
    }

}
