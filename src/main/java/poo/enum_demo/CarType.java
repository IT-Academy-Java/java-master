package poo.enum_demo;

public enum CarType {

    SEDAN("Sedan", "Small car", 4),
    STATION_WAGON("Station_Wagon", "Small car", 4),
    HATCHBACK("Hatchback", "Small car", 4),
    PICKUP("Pickup", "Small car", 4),
    COUPE("Coupe", "Small car", 4),
    SPORT("Sport", "Small car", 4);


    private final String name;
    private String description;
    private final int numDoors;

    CarType(String name, String description, int numDoors) {
        this.name = name;
        this.description = description;
        this.numDoors = numDoors;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
