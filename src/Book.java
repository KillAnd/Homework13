public class Book {
    //homework13

    private final String name;
    private int yearPublishing;
    private Author author;

    public Book(String name, int yearPublishing, Author author) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }
}