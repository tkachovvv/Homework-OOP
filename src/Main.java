public class Main {
    public static void main (String[] args) {
        Car car1 = new Car("Lada", " Granta ", 1.7f, " Yellow ", 2015, " Assembled in Russia");
        Car car2 = new Car("Audi", " A8 L TDI quattro ", 3.0f, " Black ", 2020, " Assembled in Germany");
        Car car3 = new Car("BMW", " Z8 ", 3.0f, " Black ", 2021, " Assembled in Germany");
        Car car4 = new Car("Kia", " Sportage 4-th Gen ", 2.4f, " Red ", 2018, " Assembled in South Korea");
        Car car5 = new Car("Hyundai", " Avante ", 1.6f, " Orange ", 2016, " Assembled in South Korea");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}