package com.literalura.gutendexapi;

import com.literalura.gutendexapi.model.Author;
import com.literalura.gutendexapi.model.Book;
import com.literalura.gutendexapi.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class GutendexApiApplication implements CommandLineRunner {

    @Autowired
    private GutendexService gutendexService;

    public static void main(String[] args) {
        SpringApplication.run(GutendexApiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Search for a book by title");
            System.out.println("2. List all authors");
            System.out.println("3. List living authors in a given year");
            System.out.println("4. Count books by language");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    Book book = gutendexService.fetchBookByTitle(title);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 2:
                    List<Author> authors = gutendexService.getAllAuthors();
                    System.out.println("Authors: " + authors);
                    break;
                case 3:
                    System.out.println("Enter year:");
                    int year = scanner.nextInt();
                    List<Author> livingAuthors = gutendexService.getLivingAuthorsInYear(year);
                    System.out.println("Living authors in " + year + ": " + livingAuthors);
                    break;
                case 4:
                    System.out.println("Enter language:");
                    String language = scanner.nextLine();
                    long count = gutendexService.countBooksByLanguage(language);
                    System.out.println("Number of books in " + language + ": " + count);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}