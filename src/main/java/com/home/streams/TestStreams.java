package com.home.streams;

import java.util.ArrayList;
import java.util.List;

public class TestStreams {

    
    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<String>();
        for(int i=0;i<10000;i++){
            strList.add(i+"");
        }
        
        strList.stream().forEach(s-> System.out.println(s));
        
        strList.stream().parallel().forEach(s-> System.out.println(s));
        
        System.out.println("Sequential : "+strList.stream().count());
        
        System.out.println("Parallel : "+strList.stream().parallel().count());
        
    }
}
