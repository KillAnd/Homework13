public class Main {

    public static void main(String[] args) {
        //homework13
        Author book1 = new Author("Ли", "Бардуго");
        Book book = new Book("Тень и кость", 2021, book1);
        book.setYearPublishing(2000);
        System.out.println("Книга под названием " + book.getName() + " "
                + book.getYearPublishing() + " года издания. Автор - " + book.getAuthor().getFirstName()
                + " " + book.getAuthor().getSurname());

        Author book3 = new Author("Лев", "Толстой");
        Book book2 = new Book("Война и мир", 1869, book3);
        System.out.println("Книга под названием " + book2.getName() + " "
                + book2.getYearPublishing() + " года издания. Автор - " + book2.getAuthor().getFirstName()
                + " " + book2.getAuthor().getSurname());
    }
}