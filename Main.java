public class Main {
    public static void main (String[] args){
        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджера");
        Human anya = new Human("Аня", "Москва", 1993, "методиста образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджера");
        Human artem = new Human("Артём", "Москва", 1995, "директора по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
}
