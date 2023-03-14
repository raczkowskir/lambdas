package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    List<String> numbers = Arrays.asList("one", "Two", "there", "four");

    Comparator<String> comparator =  (a, b) -> a.compareToIgnoreCase(b);
    Consumer<String> consumer = x -> System.out.println(x);
    Predicate<String> predicate = x -> x != "one";

    Stream stream = Stream.concat(numbers.stream().filter(predicate), numbers.stream().sorted(comparator));
    stream.forEach(consumer);
    }
}