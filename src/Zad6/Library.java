package Zad6;

public class Library {
    private Book[] books = new Book[5];
    private String available;
    private int counter = 0;

    Book bookPoter = new Book("potter", "ktoś", 100);
    Book bookPuchatek = new Book("puchatek", "ktoś", 30);
    Book bookGumisie = new Book("gumisie", "ktoś", 40);
    Book bookKotWButach = new Book("kot  w butach", "ktoś", 1050);
    Book bookIgrzyska = new Book("igrzyska", "ktoś", 130);


    Library libraryPotter = new Library(bookPoter, "yes");
    Library libraryPuchatek = new Library(bookPuchatek, "yes");
    Library libraryGumisie = new Library(bookGumisie, "yes");
    Library libraryKotWButach = new Library(bookKotWButach, "yes");
    Library librayIgrzyska = new Library(bookIgrzyska, "no");

    public Library(Book book, String available) {
        this.books[counter] = book;
        this.available = available;
        counter++;
    }
/*
    public void addBook(Book book, String available){
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }*/

    public void Available(Book book, String available) {
        this.available = available;
    }

    public void borrowBook() {

    }

    public void backBorrowBook() {

    }

    public void showAllAvailableBooks() {

    }

    public void showAllBorrowBooks() {

    }
}
