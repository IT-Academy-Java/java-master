package poo.enum_demo;

public enum Color {
    WHITE("White"),
    RED("Red"),
    BLUE("Blue"),
    YELLOW("Yellow"),
    GRAY("Gray"),
    ORANGE("Orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
