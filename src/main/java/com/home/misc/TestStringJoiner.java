package com.home.misc;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class TestStringJoiner {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("A");
        stringJoiner.add("B");
        stringJoiner.add("C");
        stringJoiner.add("D");

        System.out.println(stringJoiner);

        stringJoiner = new StringJoiner(",", "{", "}");
        stringJoiner.add("A");
        stringJoiner.add("B");
        stringJoiner.add("C");
        stringJoiner.add("D");
        System.out.println(stringJoiner);

        Path path = FileSystems.getDefault().getPath(".", "Mongo_Basic_Commands");
        try (Stream<String> lines = Files.lines(path)) {
            Optional<String> line = lines.filter(l -> l.contains("switching to db test")).findFirst();
            if (line.isPresent()) {
                System.out.println("Found : " + line.get());
            } else {
                System.out.println("Not Found : ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
