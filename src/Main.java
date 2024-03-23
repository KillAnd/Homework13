public class Main {

    public static void main(String[] args) {
        //homework13
        Author book1 = new Author("Ли", "Бардуго");
        Book book = new Book("Тень и кость", 2021, book1);
        book.setYearPublishing(2000);
        System.out.println("Книга под названием " + book.toString() + " года издания. Автор - " + book.getAuthor());

        Author book3 = new Author("Лев", "Толстой");
        Book book2 = new Book("Война и мир", 1869, book3);
        System.out.println("Книга под названием " + book2.toString() + " года издания. Автор - " + book2.getAuthor());

        Author book4 = new Author("Ли", "Бардуго");
        Book book5 = new Book("Тень и кость", 2019, book4);
        System.out.println("Книга под названием " + book5.toString() + " года издания. Автор - " + book5.getAuthor());

    }
}