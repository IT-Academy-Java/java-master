package java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Date> consumer = date -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(date));
        };
        consumer.accept(new Date());

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println(name + " has " + age + " years old!");
        };
        biConsumer.accept("Elena", 44);

        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("hola que ase");

        // Version
        Consumer<String> consumer2 =  System.out::println;
        consumer2.accept("hola que ase amigo");

        // With ArrayList
        Consumer<String> consumerNames = System.out::println;;
        List<String> names = Arrays.asList("\n*** Consumer Names ***\nElena", "Sophia", "Margarita", "Paco Peco", "Tere", "Isa", "Mita", "Fran" + "\n*** Fin Consumer Names ***\n");
        names.forEach(consumerNames);

    }

}
