package com.home.instants;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class TestTimeFormating {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println("Current Date : " + dateTimeFormatter.format(currentDate));

        LocalTime currentTime = LocalTime.now();
        dateTimeFormatter = DateTimeFormatter.ISO_TIME;
        System.out.println("Current Time : " + dateTimeFormatter.format(currentTime));

        LocalDateTime currentDateTime = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Current Date Time : " + dateTimeFormatter.format(currentDateTime));

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Current Date Time : " + dateTimeFormatter.format(currentDateTime));

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Current Date Time : " + dateTimeFormatter.format(currentDateTime));

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("French Time : " + dateTimeFormatter.withLocale(Locale.FRENCH).format(currentDateTime));

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder().appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("-").appendValue(ChronoField.MONTH_OF_YEAR).appendLiteral("-")
                .appendValue(ChronoField.YEAR);

        dateTimeFormatter = dtfb.toFormatter();
        System.out.println("Specific format : " + dateTimeFormatter.format(currentDateTime));

    }

}
