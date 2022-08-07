public class Main {


    public static void main(String[] args) {
        Author Tolkin = new Author("Дж. Р. Р", "Толкин");
        Book Lord_of_the_Rings = new Book("Властелин Колец", Tolkin, 1954);
        Author Eskov = new Author("Кирилл", "Еськов");
        Book Last_Spear_Man = new Book("Последний Копьеносец", Eskov, 1999);

        System.out.println("Lord_of_the_Rings.getBookName() = " + Lord_of_the_Rings.getBookName());
        System.out.println("Lord_of_the_Rings.getAuthor() = " + Lord_of_the_Rings.getAuthor());
        System.out.println("Lord_of_the_Rings.getYearPublish() = " + Lord_of_the_Rings.getYearPublish());
        System.out.println("Last_Spear_Man.getBookName() = " + Last_Spear_Man.getBookName());
        System.out.println("Last_Spear_Man.getAuthor() = " + Last_Spear_Man.getAuthor());
        System.out.println("Last_Spear_Man.getYearPublish() = " + Last_Spear_Man.getYearPublish());
        Last_Spear_Man.setYearPublish(2022);
        System.out.println("Last_Spear_Man.getYearPublish() = " + Last_Spear_Man.getYearPublish());

    }


}