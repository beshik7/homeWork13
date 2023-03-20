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

    }
}