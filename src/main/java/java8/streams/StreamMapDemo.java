package java8.streams;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {

    public static void main(String[] args) {

        Stream<String> names = Stream
                .of("Orange", "Strawberry", "Graph", "Lemmon")
                .peek(fruit -> System.out.println(fruit))
                .map(name -> {
                    return name.toUpperCase();
                });

        names.forEach(System.out::println);

        // Using Reference Methods
        System.out.println("\n**************** Using Reference Methods ********************");
        Stream<String> fruits = Stream
                .of("Apple", "Pineaple", "Watermelon", "Banana")
                .peek(System.out::println)
                .map(String::toUpperCase);

        fruits.forEach(System.out::println);

        // Using List
        System.out.println("\n******************** THE FRUITS *******************");
        Stream<String> theFruits = Stream
                .of("Apple", "Pineaple", "Watermelon", "Banana", "Orange", "Strawberry", "Graph", "Lemmon")
                //.peek(System.out::println)
                .map(String::toUpperCase);
        List<String> stringList = theFruits.collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}
