package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Paco", "Peco", "Pico", "Poco", "Puco");
        names.forEach(System.out::println); // (e -> System.out.println(e))

        System.out.println("");
        String[] array = {"Paco", "Peco", "Pico", "Poco", "Puco"};
        Stream<String> names2 = Arrays.stream(array);
        names2.forEach(System.out::print);

        // Using Stream.builder()
        Stream<String> names3 = Stream.<String>builder()
                .add("Paca")
                .add("Peca")
                .add("Pikachu")
                .build();
        names3.forEach(System.out::println);

        System.out.println("************ Names 4 **************");
        // Stream from Collections
        List<String> list = new ArrayList<>();
        list.add("Ada");
        list.add("Eda");
        list.add("Ida");

        //Stream<String> names4 = list.stream();
        //names4.forEach(System.out::println);
        list.stream().forEach(System.out::println);


    }
}
