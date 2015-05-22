package com.home.instants;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestTimeZone {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(dtf.format(ldt));

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("GMT+2"));
        System.out.println(dtf.format(zdt));

        zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dtf.format(zdt));

        System.out.println(ZoneId.getAvailableZoneIds());

    }

}
