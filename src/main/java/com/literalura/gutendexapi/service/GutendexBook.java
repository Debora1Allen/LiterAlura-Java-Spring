package com.literalura.gutendexapi.service;

import lombok.Data;

import java.util.List;

@Data
public class GutendexBook {
    private String title;
    private List<Author> authors;
    private List<String> languages;
    private int download_count;

    @Data
    public static class Author {
        private String name;
        private Integer birth_year;
        private Integer death_year;
    }
}
