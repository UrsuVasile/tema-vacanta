package sda.com.library.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.com.library.dto.BookDTO;
import sda.com.library.entity.Result;
import sda.com.library.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    //Aceasta metoda primeste o lista de BookDTO de la layer-ul Service si o paseaza catre layer-ul de Frontend
    @GetMapping("findAllBooksBarrowed")
    public List<BookDTO> findAllBooksBarrowed() {
        List<BookDTO> bookDTOSList = bookService.findAllBooksBarrowed();
        return bookDTOSList;
    }

    //Aceasta metoda primeste o lista de BookDTO de la layer-ul Service si o paseaza catre layer-ul de Frontend
    @GetMapping("findAllBooksNonBarrowed")
    public List<BookDTO> findAllBooksNonBarrowed() {
        List<BookDTO> bookDTOSList = bookService.findAllBooksNonBarrowed();
        return bookDTOSList;
    }

    //Aceasta metoda primeste o lista de BookDTO de la layer-ul Service si o paseaza catre layer-ul de Frontend
    @GetMapping("findBooksByBorrowedField/{borrowed}")
    public List<BookDTO> findBooksByBorrowedField(@PathVariable boolean borrowed) {
        List<BookDTO> bookDTOSList = bookService.findBooksByBorrowedField(borrowed);
        return bookDTOSList;
    }

    //Aceasta metoda primeste o lista de BookDTO de la layer-ul Service si o paseaza catre layer-ul de Frontend
    @GetMapping("showBooksByNrOfVolumes/{nrOfVolumes}")
    public List<BookDTO> showBooksByNrOfVolumes(@PathVariable int nrOfVolumes) {
        List<BookDTO> bookDTOSList = bookService.showBooksByNrOfVolumes(nrOfVolumes);
        return bookDTOSList;
    }

    //Aceasta metoda primeste o lista de BookDTO de la layer-ul Service si o paseaza catre layer-ul de Frontend
    @GetMapping("findAllBooksBorrowedTo/{borrowedTo}")
    public List<BookDTO> findAllBooksBorrowedTo(@PathVariable String borrowedTo) {
        List<BookDTO> bookDTOSList = bookService.findAllBooksBorrowedTo(borrowedTo);
        return bookDTOSList;
    }

    //Aceasta metoda primeste o lista de BookDTO de la layer-ul Service si o paseaza catre layer-ul de Frontend
    @GetMapping("showAllBooksFromCategory/{category}")
    public List<BookDTO> showAllBooksFromCategory(@PathVariable String category) {
        List<BookDTO> bookDTOSList = bookService.showAllBooksFromCategory(category);
        return bookDTOSList;
    }

    @GetMapping("findBooksFromCategoryAndBorrowed/{category}/{borrowed}")
    public List<BookDTO> findBooksFromCategoryAndBorrowed(@PathVariable String category, @PathVariable boolean borrowed) {
        List<BookDTO> bookDTOSList = bookService.findBooksFromCategoryAndBorrowed(category, borrowed);
        return bookDTOSList;
    }

    @GetMapping("findBooksByAuthorAndBorrowed/{author}/{borrowed}")
    public List<BookDTO> findBooksByAuthorAndBorrowed(@PathVariable String author, @PathVariable boolean borrowed) {
        List<BookDTO> bookDTOSList = bookService.findBooksByAuthorAndBorrowed(author, borrowed);
        return bookDTOSList;
    }

    @DeleteMapping("deleteBooksByTitleAuthorAndNrVolumes/{title}/{author}/{nrOfVolumes}")
    public String deleteBooksByTitleAuthorAndNrVolumes(@PathVariable String title, @PathVariable String author, @PathVariable int nrOfVolumes){
        String rowAffected = bookService.deleteBooksByTitleAuthorAndNrVolumes(title, author, nrOfVolumes);
        return rowAffected;
    }

    @GetMapping("sortASCByNrOfPages")
    public List<BookDTO> sortASCByNrOfPages(){
        List<BookDTO> bookDTOSList = bookService.sortASCByNrOfPages();
        return bookDTOSList;
    }

    @GetMapping("showBooksAndPublishingHouses")
    public List<Result> showBooksAndPublishingHouses(){
        List<Result> resultsList = bookService.showBooksAndPublishingHouses();
        return resultsList;
    }


}
