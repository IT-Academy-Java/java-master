package wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 8;
        num2 = 18;

        boolean primBoolean = num1 > num2;

        // Boxing method
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objeBoolean2 = Boolean.valueOf("false");

        System.out.println(primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objeBoolean2);

        // Comparando dos objetos boolean
        System.out.println("Comparando dos objetos boolean: " + ( objBoolean == objeBoolean2 ) );
        System.out.println("Comparando dos objetos boolean con equals: " + ( objBoolean.equals(objeBoolean2) ) );

        // unboxing method
        boolean primBoolean2 = objeBoolean2.booleanValue();
    }
}
