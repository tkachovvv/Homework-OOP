public class Car {
    private final String brand;
    private final String model;
    private final float engineVolume;
    private final String colour;
    private final int year;
    private final String country;

    Car (String brand, String model, float engineVolume, String colour, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.year = year;
        this.country = country;

    }
    public String toString() {
        return brand + model + engineVolume + colour + year + country;
    }

}
