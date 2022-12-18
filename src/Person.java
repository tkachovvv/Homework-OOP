import java.awt.print.Pageable;

public class Person {
    String name;
    String town;
    int birthYear;
    String job;

    Person (String name, String town, int birthYear, String job) {
        this.name = name;
        this.town = town;
        this.birthYear = birthYear;
        this.job = job;
    }

    @Override
    public String toString() {
        if (birthYear < 0) {
            birthYear = 0;
        } if (name == null || name.isEmpty()) {
            name = "Информация не указана";
        }if (town == null || town.isEmpty()) {
            town = "Информация не указана";
        }
        if (job == null || job.isEmpty()) {
            job = "Информация не указана";
        }
        return ("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + birthYear + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
