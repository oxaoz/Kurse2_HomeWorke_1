public class Human {

    int yearOfBirth;
    String name;
    String town;

    public Human(String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString() {
        return "Привет! Меня зовут " + name
                + ". Я из города " + town +
                ". Я родился " + yearOfBirth + " году. Будем знакомы!";
    }
}
