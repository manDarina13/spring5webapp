package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;

@Controller // le dice a spring que es un controlador
public class BookController {

    private final BookRepository bookRepository;

    /**
     * @param bookRepository
     */
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books") // cuando hagamos /books en el buscador, se llamará a este método
    public String getBooks (Model model) {

        model.addAttribute("books", bookRepository.findAll());// añade al modelo el atributo books para que cuando el controlador devuelva el modelo al dispatecher, este
                                                              // le mande el modelo a la vista para que lo utilice
        return "books";
    }
}
