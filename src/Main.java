import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        Author tolkin = new Author("Дж. Р. Р", "Толкин");

        Book lord_Of_The_Rings = new Book("Властелин Колец", tolkin, 1954);
        Author eskov = new Author("Кирилл", "Еськов");
        Book last_Spear_Man = new Book("Последний Копьеносец", eskov, 1999);

        System.out.println(lord_Of_The_Rings);
        System.out.println(last_Spear_Man);
        last_Spear_Man.setYearPublish(2022);
        System.out.println("Last_Spear_Man.getYearPublish() = " + last_Spear_Man.getYearPublish());
        System.out.println(last_Spear_Man);

        Book lr_2 = new Book("Властелин Колец", tolkin, 1954);
        System.out.println(lr_2);

        if (lr_2.hashCode() == lord_Of_The_Rings.hashCode())
        {
            System.out.println("hashCodes совпадают");
        } else
        {
            System.out.println("разница в hashcodes" + lr_2.hashCode() + " != " + lord_Of_The_Rings.hashCode());
        }

        System.out.println("Сравнение книг - " + lord_Of_The_Rings.equals(lr_2));


        }
}





