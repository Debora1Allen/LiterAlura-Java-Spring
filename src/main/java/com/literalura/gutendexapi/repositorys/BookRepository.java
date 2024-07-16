package com.literalura.gutendexapi.repositorys;

import com.literalura.gutendexapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByLanguages(String language);
}
