package poo.enum_demo;

public class Car {

    private String brand;
    private String model;
    private Color color;
    private CarType type;

    public Car() {
    }

    public Car(String brand, String model, Color color, CarType type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
