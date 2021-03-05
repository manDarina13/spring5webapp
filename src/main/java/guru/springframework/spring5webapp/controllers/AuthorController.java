package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepositry;

    /**
     * @param authorRepositry
     */
    public AuthorController(AuthorRepository authorRepositry) {
        this.authorRepositry = authorRepositry;
    }

    @RequestMapping("/authors") // cuando hagamos /authors en el buscador, se llamará a este método
    public String getAuthorString (Model modelo) {

        modelo.addAttribute("autors", authorRepositry.findAll());

        return "autores/lista";

    }

}
