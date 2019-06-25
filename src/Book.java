public class Book extends Product {

    private String author;
    private int pages;

    public Book() {
        super();
        author = "";
        pages = 0;
    }

    public Book(String code, String description, double price, String author, int pages) {
        super();
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}