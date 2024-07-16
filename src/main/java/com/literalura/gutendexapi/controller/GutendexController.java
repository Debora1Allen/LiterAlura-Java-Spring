package com.literalura.gutendexapi.controller;

import com.literalura.gutendexapi.model.Author;
import com.literalura.gutendexapi.model.Book;
import com.literalura.gutendexapi.service.GutendexService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GutendexController {

    private final GutendexService gutendexService;

    @GetMapping("/book/{title}")
    public Book getBookByTitle(@PathVariable String title) {
        return gutendexService.fetchBookByTitle(title);
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return gutendexService.getAllAuthors();
    }

    @GetMapping("/authors/living/{year}")
    public List<Author> getLivingAuthorsInYear(@PathVariable Integer year) {
        return gutendexService.getLivingAuthorsInYear(year);
    }

    @GetMapping("/books/count/{language}")
    public long getBooksCountByLanguage(@PathVariable String language) {
        return gutendexService.countBooksByLanguage(language);
    }
}