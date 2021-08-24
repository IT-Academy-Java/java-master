package wrapper;

public class NumericWrapper {
    public static void main(String[] args) {
        int myint = 9;
        Integer integer = Integer.valueOf(myint);
        Long mylong = Long.valueOf(myint);

        Long mainLong = Long.valueOf(2345678);
        Long otroLong = mainLong.longValue();

        int otroInt = mainLong.intValue();
        float otroFloat = mainLong.floatValue();

        // Double.valueOf(String s) devuelve un  Double
        Double doubleDemo =  Double.valueOf("3.1416");

        // Double.parseDouble("3.1416") devuelve un double
        double primitiveDoubleDemo = Double.parseDouble("3.1416");

        // Convertir un double a un String
        String stringFromDouble = Double.toString(primitiveDoubleDemo);

        System.out.println(stringFromDouble);
    }
}
