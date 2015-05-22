package com.home.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestTraversal {

    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<String>();
        strList.add("AAA");
        strList.add("BBB");
        strList.add("CCC");
        strList.add("DDD");
        
        Iterator<String> iterator = strList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        
        System.out.println("\nUsing Lmabda : ");
        strList.forEach( str -> System.out.print(str +" "));
        
    }
    
}
