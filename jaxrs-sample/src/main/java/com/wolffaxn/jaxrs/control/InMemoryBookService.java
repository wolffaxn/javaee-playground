package com.wolffaxn.jaxrs.control;

import com.wolffaxn.jaxrs.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookService {

    public InMemoryBookService() {}

    List<Book> findAll() {
        final List<Book> list = new ArrayList<Book>();
        list.add(new Book(1L, "Book1", "Publisher1"));
        list.add(new Book(2L, "Book2", "Publisher2"));
        return list;
    }
}
