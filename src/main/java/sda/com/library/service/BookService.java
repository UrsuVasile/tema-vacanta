package sda.com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.com.library.dao.BookDAO;
import sda.com.library.dto.BookDTO;
import sda.com.library.entity.Book;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDAO bookDAO;

    //Aceasta metoda face conversia listei de Book primite de la BookDAO, intr-o lista de BookDTO, pe care o returneaza si o va pasa mai departe catre BookController
    public List<BookDTO> findAllBooksBarrowed() {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.findAllBooksBorrowed();

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());
            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    //Aceasta metoda face conversia listei de Book primite de la BookDAO, intr-o lista de BookDTO, pe care o returneaza si o va pasa mai departe catre BookController
    public List<BookDTO> findAllBooksNonBarrowed() {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.findAllBookNonBarrowed();

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());
            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    //Aceasta metoda face conversia listei de Book primite de la BookDAO, intr-o lista de BookDTO, pe care o returneaza si o va pasa mai departe catre BookController
    public List<BookDTO> findBooksByBorrowedField(boolean borrowed) {
        List<Book> booksList = bookDAO.findBooksByBorrowedField(borrowed);
        List<BookDTO> bookDTOSList = new LinkedList<>();

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    //Aceasta metoda face conversia listei de Book primite de la BookDAO, intr-o lista de BookDTO, pe care o returneaza si o va pasa mai departe catre BookController
    public List<BookDTO> showBooksByNrOfVolumes(int nrOfVolumes) {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.showBooksByNrOfVolumes(nrOfVolumes);

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    public List<BookDTO> findAllBooksBorrowedTo(String borrowedTo) {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.findAllBooksBorrowedTo(borrowedTo);

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    public List<BookDTO> showAllBooksFromCategory(String category) {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.showAllBooksFromCategory(category);

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    public List<BookDTO> findBooksFromCategoryAndBorrowed(String category, boolean borrowed) {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.findBooksFromCategoryAndBorrowed(category, borrowed);

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    public List<BookDTO> findBooksByAuthorAndBorrowed(String author, boolean borrowed) {
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.findBooksByAuthorAndBorrowed(author, borrowed);

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

    public String deleteBooksByTitleAuthorAndNrVolumes(String title, String author, int nrOfVolumes) {
        String rowAffected = bookDAO.deleteBooksByTitleAuthorAndNrVolumes(title, author, nrOfVolumes);
        return rowAffected;
    }

    public List<BookDTO> sortASCByNrOfPages(){
        List<BookDTO> bookDTOSList = new LinkedList<>();
        List<Book> booksList = bookDAO.sortASCByNrOfPages();

        for (Book b : booksList) {
            BookDTO bookDTO = new BookDTO();

            bookDTO.setTitle(b.getTitle());
            bookDTO.setAuthor(b.getAuthor());
            bookDTO.setCategory(b.getCategory());
            bookDTO.setNrOfPages(b.getNrOfPages());
            bookDTO.setNrOfVolumes(b.getNrOfVolumes());
            bookDTO.setBorrowedTo(b.getBorrowedTo());
            bookDTO.setBorrowed(b.getBorrowed());

            bookDTOSList.add(bookDTO);
        }
        return bookDTOSList;
    }

}
