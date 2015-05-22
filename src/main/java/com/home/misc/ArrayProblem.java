package com.home.misc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class ArrayProblem {

    public static void main(String[] args) {
        replaceElementByGreaterOrMinusOne(new int[] { 11, 13, 21, 3, 2, 5, 7 });
    }

    public static void replaceElementByGreaterOrMinusOne(int[] input) {
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        stack.push(input[0]);
        Integer next = 0;
        Integer poppedElement = 0;

        for (int i = 1; i < input.length; i++) {
            next = input[i];
            if (!stack.isEmpty()) {
                poppedElement = stack.pop();
                while (poppedElement < next) {
                    map.put(poppedElement, next);
                    if (stack.isEmpty())
                        break;
                    poppedElement = stack.pop();
                }
                if (poppedElement > next)
                    stack.push(poppedElement);
            }
            stack.push(next);
        }
        
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        
        System.out.println(map);
    }

}
