package java8.lambda;

import java8.lambda.models.User;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<User> createUser = User::new;
        User user1 = createUser.get();

        BiConsumer<User, String> assignName = User::setName;
        assignName.accept(user1, "Elena Margarita");

        System.out.println(user1);
    }
}
