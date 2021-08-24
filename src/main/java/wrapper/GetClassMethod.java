package wrapper;

import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) {

        String text = "Hello, how are you?";
        Class strClass = text.getClass();

        System.out.println("strClass.getName() => " + strClass.getName());
        System.out.println("strClass.getSimpleName()) => " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() => " + strClass.getPackageName());
        System.out.println("strClass.getName() => " + strClass);

        // List of all methods of Class
        for (Method method: strClass.getMethods()) {
            System.out.println("method.getName() => " + method.getName());
        }

        Integer num = 20;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();

        System.out.println("\n *************************** intClass.getSuperclass()-.getSuperclass() ***************************\n " + intClass.getSuperclass());
        System.out.println("\n *************************** intClass.getSuperclass()-.getSuperclass() ***************************\n " + objClass);


        System.out.println("\n *************************** getName method ***************************\n ");
        for (Method method : objClass.getMethods()) {
            System.out.println("getName() Method => " + method.getName());
        }




    }
}
