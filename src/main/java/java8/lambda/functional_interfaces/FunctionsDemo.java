package java8.lambda.functional_interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsDemo {

    public static void main(String[] args) {
        Function<String, String> function1 = param -> "Hola que ase,  " + param;
        System.out.println(function1.apply("helena"));

        // Simplified this: Function<String, String> function2 = param -> param.toUpperCase();
        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("sophia"));

        BiFunction<String, String, String> function3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(function3.apply("sophia", "helena"));


        BiFunction<String, String, Integer> f4 = String::compareTo; // (a, b) -> a.compareTo
        System.out.println(f4.apply("helena", "helena"));

        BiFunction<String, String, String> f5 = String::concat; // () -> a.concat(b)
        System.out.println(f5.apply("helena", "mercury"));

    }
}
