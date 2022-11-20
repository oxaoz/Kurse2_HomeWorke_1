public class Human {

   private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;
    String zero = "«Информация не указана»";
    int currentYear = 2022;



    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;

        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = zero;
        } else this.name = name;

        if (town == null || town.isEmpty() || name.isBlank()) {
            this.town = zero;
        }else this.town = town;

        if (jobTitle == null || jobTitle.isEmpty() || name.isBlank()) {
            this.jobTitle = "Я нигде не работаю";
        }else this.jobTitle = jobTitle;
        }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = zero;
        }else this.town = town;
        this.town = town;
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