public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String colour;
    private int year;
    private String country;

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
