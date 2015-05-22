package com.home.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<String>();
        strList.add("AAA");
        strList.add("BBB");
        strList.add("CAC");
        strList.add("DDD");

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return str.contains("A");
            }
        };

        for (String string : strList) {
            if (predicate.test(string)) {
                System.out.print(string + " ");
            }
        }

        System.out.println("\nUsing Lambda : ");
        Predicate<String> testPredicate = (s1) ->  s1.contains("A");
        strList.forEach(s1 -> {
            if (testPredicate.test(s1)) {
                System.out.print(s1 + " ");
            }
        });

    }

}
