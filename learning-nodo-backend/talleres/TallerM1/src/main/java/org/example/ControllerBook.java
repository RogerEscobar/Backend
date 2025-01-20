package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerBook {
//Metodo para controlar solicitudes
    @GetMapping("/book")
    public String showBook (@RequestParam String title,
                            @RequestParam String author,
                            @RequestParam int year,
                            Model model) {
        Book book = new Book(title, author, year);
        model.addAttribute("book", book);
        return  "DetallesDelLibro";
    }
}
