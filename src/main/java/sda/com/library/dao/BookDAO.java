package sda.com.library.dao;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSOutput;
import sda.com.library.config.HibernateUtil;
import sda.com.library.entity.Book;

import javax.persistence.Query;
import java.util.List;

@Repository
public class BookDAO {

    HibernateUtil hibernateUtil = new HibernateUtil();

    //Aceasta metoda returneaza pe baza query-ului toate cartile imprumutate catre cititori
    public List<Book> findAllBooksBorrowed() {
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("find_all_book_borrowed");
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

    //Aceasta metoda returneaza pe baza query-ului toate cartile neimprumutate
    public List<Book> findAllBookNonBarrowed() {
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("find_all_books_non_barrowed");
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

    //Aceasta metoda returneaza cartile imprumutate sau neimprumutate, in functie de parametrul pe care-l primeste (true/false)
    public List<Book> findBooksByBorrowedField(boolean borrowed) {
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("find_books_by_borrowed_field");
        query.setParameter("borrowed", borrowed);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

    //Aceasta metoda afiseaza cartile in functie de numarul de volume pe care il dam ca parametru
    public List<Book> showBooksByNrOfVolumes(int nrOfVolumes){
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("show_books_by_nr_of_volumes");
        query.setParameter("nrOfVolumes", nrOfVolumes);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

    //Aceasta metoda afiseaza toate cartile imprumutate unui cititor, pe care trebuie sa i-l dam ca parametru
    public List<Book> findAllBooksBorrowedTo(String borrowedTo){
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("findAllBooksBorrowedTo");
        query.setParameter("borrowedTo", borrowedTo);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }
    //Aceasta metoda afiseaza toate cartile dintr-o anumita categorie
    public List<Book> showAllBooksFromCategory(String category){
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("showAllBooksFromCategory");
        query.setParameter("category", category);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }
    //Aceasta metoda returneaza o lista de carti in functie de categoria aleasa si daca este sau nu imprumutata
    public List<Book> findBooksFromCategoryAndBorrowed(String category, boolean borrowed){
        hibernateUtil.openSessionAndTransaction();
        Query query = hibernateUtil.session.createNamedQuery("find_books_from_category_and_borrowed");
        query.setParameter("category", category);
        query.setParameter("borrowed", borrowed);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

    //Aceasta functie returneaza o lista de carti in functie de 2 parametri: autor si daca este imprumutata
    public List<Book> findBooksByAuthorAndBorrowed (String author, boolean borrowed){
        hibernateUtil.openSessionAndTransaction();
        String findBooks = "Select b from Book b where b.author = :author and b.borrowed = :borrowed";
        Query query = hibernateUtil.session.createQuery(findBooks);
        query.setParameter("author", author);
        query.setParameter("borrowed", borrowed);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

    //Aceasta metoda sterge o carte din BD in functie de 3 parametri: Titlu, Autor si nr. de volume al cartii
    public String deleteBooksByTitleAuthorAndNrVolumes(String title, String author, int nrOfVolumes){
        hibernateUtil.openSessionAndTransaction();
        String deleteQuery = "Delete Book b where b.title = :title and b.author = :author and b.nrOfVolumes = :nrOfVolumes";
        Query query = hibernateUtil.session.createQuery(deleteQuery);
        query.setParameter("title", title);
        query.setParameter("author", author);
        query.setParameter("nrOfVolumes", nrOfVolumes);
        int rowAffected = query.executeUpdate();
        hibernateUtil.closeSessionAndTransaction();
        String result = rowAffected+" row(s) deleted";
        return result;
    }

    // Aceasta metoda afiseaza toate cartile din BD in functie de nr. de pagini, crescator.
    public List<Book> sortASCByNrOfPages(){
        hibernateUtil.openSessionAndTransaction();
        String sortQuery = "Select b from Book b order by b.nrOfPages asc";
        Query query = hibernateUtil.session.createQuery(sortQuery);
        List<Book> booksList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return booksList;
    }

}
