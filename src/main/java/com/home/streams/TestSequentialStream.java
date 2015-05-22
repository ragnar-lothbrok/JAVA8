package com.home.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

import com.home.lambda.IPerson;
import com.home.lambda.Person;

public class TestSequentialStream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Ram", 48));
        people.add(new Person("Raheem", 23));
        people.add(new Person("Shyam", 21));

        Predicate<Person> predicate = (p) -> {
            return p.getAge() >= 45;
        };

        displayPerson(people, predicate);
        
        System.out.println("Age total : "+people.stream().mapToInt(p-> p.getAge()).sum());
        
        OptionalDouble avg = people.stream().mapToInt(p-> p.getAge()).average();
        System.out.println("Average total : "+(avg.isPresent() ? avg.getAsDouble():"No Calculated"));

    }

    private static void displayPerson(List<Person> people, Predicate<Person> predicate) {
        System.out.println("Filtered : ");

        people.parallelStream().filter(predicate).forEach(p1 -> System.out.println(IPerson.getPersonInfos(p1)));

        // OR

        people.stream().parallel().filter(predicate).forEach(p1 -> System.out.println(IPerson.getPersonInfos(p1)));
    }
}
