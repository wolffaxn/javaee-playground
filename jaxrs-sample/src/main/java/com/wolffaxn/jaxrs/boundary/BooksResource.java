package com.wolffaxn.jaxrs.boundary;

import com.wolffaxn.jaxrs.entity.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("items")
public class BooksResource {

    public BooksResource() {}

    @GET
    @Produces("application/json")
    public List<Book> findAll() {
        final List<Book> books = new ArrayList<Book>();
        books.add(new Book(1L, "Test", "Test"));
        return books;
    }
}
