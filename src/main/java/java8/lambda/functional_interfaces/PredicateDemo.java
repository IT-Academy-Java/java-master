package java8.lambda.functional_interfaces;

import java8.lambda.models.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 10;
        boolean result = test.test(22);
        System.out.println("Result -> " + result);

        Predicate<String> predicate = role -> role.equals("ROLE_ADMIN");
        System.out.println(predicate.test("ROLE_GUESS"));

        BiPredicate<String, String> biPredicate = String::equals; // (a,b)->a.equals(b);
        System.out.println(biPredicate.test("sophia", "sophia"));

        BiPredicate<Integer, Integer> biPredicate1 = (i,j) -> j > 1;
        System.out.println("With BiPredicate 1 -> " + biPredicate1.test(5, 10));

        User user1 = new User();
        User user2 = new User();
        user1.setName("conchita");
        user2.setName("conchita");
        BiPredicate<User, User> biPredicate2 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println("\nBiPredicat 2 -> " + biPredicate2.test(user1, user2));

    }
}
