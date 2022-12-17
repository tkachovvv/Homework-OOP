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

    public String toString() {
        return ("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + birthYear + " году. Я работаю на должности " + job + ".");
    }
}
