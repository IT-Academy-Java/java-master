package poo.enum_demo;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Astra", Color.RED, CarType.SEDAN);
        System.out.println(car);
        System.out.println(car.getColor());

        CarType type = car.getType();

        switch (type) {
            case SEDAN -> System.out.println("The Sedan");
            case PICKUP -> System.out.println("The pickup");
            case STATION_WAGON -> System.out.println("The satation wagon");
            case HATCHBACK -> System.out.println("The hatchback");
            case COUPE -> System.out.println("The coupe");
            case SPORT -> System.out.println("The sport model");
        }
    }
}

