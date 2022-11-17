public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;
    String zero = "«Информация не указана»";



    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;

        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;

        if (name == null || name.isEmpty()) {
            this.name = zero;
        } else this.name = name;

        if (town == null || town.isEmpty()) {
            this.town = zero;
        }else this.town = town;

        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = zero;
        }else this.jobTitle = jobTitle;
        }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name
                + ". Я из города " + town +
                ". Я родился " + yearOfBirth + " году." +
                "Я работаю на должности " + jobTitle + " Будем знакомы!";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass().equals(this.getClass())) {
            if (obj == this) return true;
            Human human = (Human) obj;
            return name.equals(((Human) obj).name) && yearOfBirth == ((Human) obj).yearOfBirth && town.equals(((Human) obj).town) && jobTitle.equals(((Human) obj).jobTitle);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, yearOfBirth, town, jobTitle);
    }
}
/*Если не указано имя, город проживания или должность, то есть передана пустая строка или null,
то программа должна подставить значение «Информация не указана» при выводе в консоль.
 */