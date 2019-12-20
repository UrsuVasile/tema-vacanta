package sda.com.library.dto;

import java.util.Objects;

public class BookDTO {
    private String title;
    private String author;
    private int nrOfPages;
    private int nrOfVolumes;
    private boolean borrowed;
    private String borrowedTo;
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return nrOfPages == bookDTO.nrOfPages &&
                nrOfVolumes == bookDTO.nrOfVolumes &&
                borrowed == bookDTO.borrowed &&
                Objects.equals(title, bookDTO.title) &&
                Objects.equals(author, bookDTO.author) &&
                Objects.equals(borrowedTo, bookDTO.borrowedTo) &&
                Objects.equals(category, bookDTO.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, nrOfPages, nrOfVolumes, borrowed, borrowedTo, category);
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", nrOfPages=" + nrOfPages +
                ", nrOfVolumes=" + nrOfVolumes +
                ", borrowed=" + borrowed +
                ", borrowedTo='" + borrowedTo + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
