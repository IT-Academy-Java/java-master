package java8.streams.streamMap.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<User> users = Stream.of("elena piaggio", "sophia mercury", "pepe vazquez", "silvia pardo")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .map(user -> {
                    user.setName(user.getName().toUpperCase());
                    user.setSurname(user.getSurname().toUpperCase());
                    return user;
                });

        List<User> userList = users.collect(Collectors.toList());
        userList.forEach(System.out::println); // (user -> System.out.println(user))
    }
}
