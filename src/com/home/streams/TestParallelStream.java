package com.home.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.home.lambda.IPerson;
import com.home.lambda.Person;

public class TestParallelStream {

    public static void main(String[] args) {
        
        List<Person> people = new ArrayList<>();

        people.add(new Person("Ram", 48));
        people.add(new Person("Raheem", 23));
        people.add(new Person("Shyam", 21));

        Predicate<Person> predicate = (p) -> {
          return p.getAge() >= 45;  
        };
        
        displayPerson(people,predicate);
        
    }

    private static void displayPerson(List<Person> people, Predicate<Person> predicate) {
        System.out.println("Filtered : ");
        
        people.stream()
              .filter(predicate)
              .forEach(p1 -> System.out.println(IPerson.getPersonInfos(p1)));
    }
}
