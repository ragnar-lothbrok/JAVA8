package com.home.streams;

import java.util.Arrays;
import java.util.stream.Stream;

import com.home.lambda.IPerson;
import com.home.lambda.Person;

public class PrintArrayUsingStream {

    public static void main(String[] args) {

        Person person[] = { new Person("Ram", 45), new Person("Raju", 76), new Person("Kalia", 23) };

        Stream<Person> pStream = Stream.of(person);

        pStream.forEach(p -> System.out.println(IPerson.getPersonInfos(p)));

        pStream = Arrays.stream(person);

        pStream.forEach(p -> System.out.println(IPerson.getPersonInfos(p)));

    }

}
