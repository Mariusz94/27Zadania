package Zad6;

public class Book {
    private String title;
    private String author;
    private int numberOfParties;

    public Book(String title, String author, int numberOfParties) {
        this.title = title;
        this.author = author;
        this.numberOfParties = numberOfParties;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfParties() {
        return numberOfParties;
    }

    public void setNumberOfParties(int numberOfParties) {
        this.numberOfParties = numberOfParties;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfParties=" + numberOfParties +
                '}';
    }
}
