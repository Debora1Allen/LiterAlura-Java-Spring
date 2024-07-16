package com.literalura.gutendexapi.service;

import com.literalura.gutendexapi.model.Author;
import com.literalura.gutendexapi.model.Book;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GutendexService {

    private final com.literalura.gutendexapi.repositorys.BookRepository bookRepository;
    private final com.literalura.gutendexapi.repositorys.AuthorRepository authorRepository;
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String GUTENDEX_API_URL = "https://gutendex.com/books?search=";

    public Book fetchBookByTitle(String title) {
        String url = GUTENDEX_API_URL + title;
        GutendexResponse response = restTemplate.getForObject(url, GutendexResponse.class);

        if (response != null && !response.getResults().isEmpty()) {
            GutendexBook result = response.getResults().get(0);
            Book book = new Book(null, result.getTitle(), result.getAuthors().get(0).getName(),
                    result.getLanguages().get(0), result.getDownload_count());
            bookRepository.save(book);

            Author author = new Author(null, result.getAuthors().get(0).getName(),
                    result.getAuthors().get(0).getBirth_year(), result.getAuthors().get(0).getDeath_year());
            authorRepository.save(author);

            return book;
        }

        return null;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public List<Author> getLivingAuthorsInYear(Integer year) {
        return authorRepository.findByBirthYearLessThanEqualAndDeathYearGreaterThanEqualOrDeathYearIsNull(year, year);
    }

    public long countBooksByLanguage(String language) {
        return bookRepository.findByLanguages(language).size();
    }
}