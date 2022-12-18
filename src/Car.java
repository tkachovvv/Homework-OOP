public class Car {
    String brand;
    String model;
    float engineVolume;
    String colour;
    int year;
    String country;

    Car(String brand, String model, float engineVolume, String colour, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        if (brand == null || brand.isEmpty()) {
            brand = "Default";
        } if (model == null || model.isEmpty()) {
            model = "Default";
        } if (country == null || country.isEmpty()) {
            country = "Default";
        } if (year <= 0) {
            year = 2000;
        } if (colour == null || colour.isEmpty()) {
            colour = "White";
        } if (engineVolume <= 0) {
            engineVolume = 1.5f;
        }
        return (brand + model + engineVolume + colour + year + country);
    }
}

