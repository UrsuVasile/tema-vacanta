package sda.com.library.entity;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "find_all_book_borrowed",
                query = "Select b from Book b where b.borrowed = true"),
        @NamedQuery(name = "find_all_books_non_barrowed",
                query = "Select b from Book b where b.borrowed = false"),
        @NamedQuery(name = "find_books_by_borrowed_field",
                query = "Select b from Book b where b.borrowed = :borrowed"),
        @NamedQuery(name = "show_books_by_nr_of_volumes",
                query = "Select b from Book b where b.nrOfVolumes = :nrOfVolumes"),
        @NamedQuery(name = "findAllBooksBorrowedTo",
                query = "Select b from Book b where b.borrowedTo=:borrowedTo"),
        @NamedQuery(name = "showAllBooksFromCategory",
                query = "Select b from Book b where b.category = :category"),
        @NamedQuery(name = "find_books_from_category_and_borrowed",
                query = "Select b from Book b where b.category = :category and b.borrowed=:borrowed"),
        @NamedQuery(name = "show_all_books_and_publishing_houses",
                query = "select new sda.com.library.entity.Result(b.title, b.author, p.publishingHouseName) from Book b inner join b.publishingHouse p")
})

@Entity
@Table(name = "books")
public class Book {

    private static final String BOOK_SEQUENCE = "book_id_sequence";
    private static final String BOOK_GENERATOR = "book_generator";

    @Id
    @SequenceGenerator(name = "BOOK_GENERATOR", sequenceName = BOOK_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = BOOK_GENERATOR)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "nr_of_pages")
    private int nrOfPages;

    @Column(name = "nr_of_volumes")
    private int nrOfVolumes;

    @Column(name = "borrowed")
    private boolean borrowed;

    @Column(name = "borrowed_to")
    private String borrowedTo;

    @Column(name = "category")
    private String category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_publishing_house")
    private PublishingHouse publishingHouse;

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

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public int getNrOfVolumes() {
        return nrOfVolumes;
    }

    public void setNrOfVolumes(int nrOfVolumes) {
        this.nrOfVolumes = nrOfVolumes;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getBorrowedTo() {
        return borrowedTo;
    }

    public void setBorrowedTo(String borrowedTo) {
        this.borrowedTo = borrowedTo;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
