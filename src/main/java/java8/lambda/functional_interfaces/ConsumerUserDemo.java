package java8.lambda.functional_interfaces;

import java8.lambda.models.User;

import java.util.function.BiConsumer;

public class ConsumerUserDemo {

    public static void main(String[] args) {
        User user = new User();
        BiConsumer<User, String> assignName = (oneUser, name) -> {
            oneUser.setName(name);
        };
        assignName.accept(user, "elena");
        System.out.println("User name => " + user.getName());

        System.out.println("\n**************** SECOND FORM **************");
        User user1 = new User();
        BiConsumer<User, String> assignNameSimplified = User::setName;
        assignNameSimplified.accept(user1, "sophia");
        System.out.println("Username => " + user1.getName());


    }
}
