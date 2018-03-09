/*
 * BookLandsman class
 *
 * This creates an instance of a book.
 *
 * Author: Josh Landsman
 */

public class BookLandsman {

    // Instance Variables
    private String title;
    private String author;
    private int year;
    private int pages;
    private int pagesRead;

    // Main Constructor
    public BookLandsman(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.pagesRead = 0;
    }

    // Accessors
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public int getYear() { return this.year; }
    public int getPages() { return this.pages; }
    public int getPagesRead() { return this.pagesRead; }

    // Reset pagesRead to 0
    public void startOver() {
        this.pagesRead = 0;
    }

    // returns pages left in book
    private int pagesLeft() {
        return this.pages - this.pagesRead;
    }

    // Increments pagesRead by p
    public String read(int p) {
        this.pagesRead += p;
        return (this.pagesRead >= this.pages) ? "Book Complete": pagesLeft() + " pages remaining.";
    }
    // Deafault read
    public String read() {
        return read(1);
    }

    // Returns String of Book object
    public String toString() {
        return this.title + "(" + this.year + ")\n\t" +
               "Author: " + this.author + "\n\t" +
               "Pg. " + this.pagesRead + "/" + this.pages;
    }
}
