import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Car car1 = new Car("Lada", " Granta ", 1.7f, " Yellow ", 2015, " Assembled in Russia");
        Car car2 = new Car("Audi", " A8 L TDI quattro ", 3.0f, " Black ", 2020, " Assembled in Germany");
        Car car3 = new Car("BMW", " Z8 ", 3.0f, " Black ", 2021, " Assembled in Germany");
        Car car4 = new Car("Kia", " Sportage 4-th Gen ", 2.4f, " Red ", 2018, " Assembled in South Korea");
        Car car5 = new Car("Hyundai", " Avente ", 0, " Orange ", 0, " Assembled in South Korea");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Person person1 = new Person ("Максим", "Москва", 1997, "преподавателя в университете");
        Person person2 = new Person("Аня", "Киев", 1985, "бухгалтера");
        Person person3 = new Person("Катя", "Подольск", 2003, "официанта в кофейне");
        Person person4 = new Person("Артем", "Краков", 1964, "директора банка");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

    }
}