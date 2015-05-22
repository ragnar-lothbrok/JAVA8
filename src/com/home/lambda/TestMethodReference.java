package com.home.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMethodReference {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Ram", 48));
        people.add(new Person("Raheem", 23));
        people.add(new Person("Shyam", 21));

        Collections.sort(people, Person::compareAge);
        people.forEach(p1 -> System.out.println(p1.getPersonInfo()));

        Collections.sort(people, new Person()::compareAges);
        people.forEach(p1 -> System.out.println(p1.getPersonInfo()));
        
        Collections.sort(people, TestMethodReference ::compareAges);
        people.forEach(p1 -> System.out.println(IPerson.getPersonInfos(p1)));

    }
    
    public static int compareAges(Person p1,Person p2){
        return -((Integer)p1.getAge()).compareTo(p2.getAge());
    }

}
