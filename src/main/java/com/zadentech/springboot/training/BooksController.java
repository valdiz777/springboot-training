package com.zadentech.springboot.training;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BooksController
 */
@RestController
public class BooksController {

    @GetMapping(value = "/books")
    public List getAllBooks() {
        return Arrays.asList(new Book(1L, "Harry Potter 2", "JK Rowling"),
                new Book(2L, "Mortal Instruments", "Stephanie lll"));
    }

}