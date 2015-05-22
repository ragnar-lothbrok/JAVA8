package com.home.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<String>();
        strList.add("AAA");
        strList.add("BBB");
        strList.add("CCC");
        strList.add("DDD");

        Collections.sort(strList);

        System.out.println("Default Sort : " + strList);

        Collections.shuffle(strList);
        System.out.println("After Shuffling :" + strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sort With Comparator : " + strList);

        Collections.shuffle(strList);
        System.out.println("After Shuffling :" + strList);

        Comparator<String> comparator = (s1, s2) -> {
            return s1.compareTo(s2);
        };

        Collections.sort(strList, comparator);

        System.out.println("Sort With Lambda Comparator : " + strList);

    }
}
