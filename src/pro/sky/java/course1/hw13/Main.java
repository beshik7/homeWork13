package pro.sky.java.course1.hw13;

public class Main {
    public static void main(String[] args) {
        // создаем 2 объекта (авторов)
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");
        //создаем 2 обьекта (книги)
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        // меняю дату публикации
        book2.setReleaseYear(1967);
        //вывод справочника в консоль
        System.out.println(" Книга 1: " + book1.getTitle() + " | Автор: " + author1.getFirstName() + " " + author1.getLastName() + " | Год публикации: " + book1.getReleaseYear());
        System.out.println(" Книга 2: " + book2.getTitle() + " | Автор: " + author2.getFirstName() + " " + author2.getLastName() + " | Год публикации: " + book2.getReleaseYear());
        System.out.println();
        // Вывод результатов toString()
        System.out.println("Книга 1 (toString): " + book1.toString());
        System.out.println("Книга 2 (toString): " + book2.toString());
        System.out.println("Автор 1 (toString): " + author1.toString());
        System.out.println("Автор 2 (toString): " + author2.toString());
        System.out.println();

        // Вывод результатов сравнения методом equals()
        System.out.println("Книги 1 и 2 равны? " + book1.equals(book2));
        System.out.println("Авторы 1 и 2 равны? " + author1.equals(author2));

        // Создаем два одинаковых объекта автора и книги
        Author author3 = new Author("Лев", "Толстой");
        Book book3 = new Book("Война и мир", author3, 1869);

        // Вывод результатов сравнения методом equals()
        System.out.println("Книги 1 и 3 равны? " + book1.equals(book3));
        System.out.println("Авторы 1 и 3 равны? " + author1.equals(author3));
        System.out.println();
        // Вывод результатов hashCode()
        System.out.println("Книга 1 (hashCode): " + book1.hashCode());
        System.out.println("Книга 2 (hashCode): " + book2.hashCode());
        System.out.println("Книга 3 (hashCode): " + book3.hashCode());
        System.out.println("Автор 1 (hashCode): " + author1.hashCode());
        System.out.println("Автор 2 (hashCode): " + author2.hashCode());
        System.out.println("Автор 3 (hashCode): " + author3.hashCode());

    }
}