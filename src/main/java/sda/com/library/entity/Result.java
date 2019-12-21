package sda.com.library.entity;

//Aceasta clasa este pentru a putea afisa rezultatul de join a 2 tabele: Book si PublishingHouse
public class Result {

    private Book book;

    private PublishingHouse publishingHouse;

    private String bookTitle;

    private String bookAuthor;

    private String publishingHouseName;


    public Result(String bookTitle, String bookAuthor, String publishingHouseName) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishingHouseName = publishingHouseName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        this.publishingHouseName = publishingHouseName;
    }
}
