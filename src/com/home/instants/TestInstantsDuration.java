package com.home.instants;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestInstantsDuration {

    public static void main(String[] args) throws InterruptedException {

        Instant start = Instant.now();
        System.out.println(start);
        Thread.sleep(1000);
        Instant end = Instant.now();
        System.out.println(end);

        System.out.println("Elapsed : " + Duration.between(start, end).toMillis() + " MilliSeconds");

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date : " + currentDate);

        currentDate = LocalDate.of(2012, 11, 12);
        System.out.println("Specific Date : " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time : " + currentTime);

        currentTime = LocalTime.of(14, 00, 23);
        System.out.println("Specific Time : " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date Time : " + currentDateTime);

        currentDateTime = LocalDateTime.of(currentDate, currentTime);
        System.out.println("Specific Date Time : " + currentDateTime);
    }

}
