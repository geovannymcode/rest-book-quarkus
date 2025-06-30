package org.gmendoza.quarkus.starting;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {


    public List<Book> getAllBooks() {
        return List.of(
                new Book(1,"Understanding Kotlin", "Geovanny Mendoza", 2025, "IT" ),
                new Book(2,"Understanding Quarkus", "Omar Berroteran", 2024, "IT" ),
                new Book(3,"Understanding Java", "Elena Aguirre", 2023, "IT" ),
                new Book(4,"Effective Java in Action", "Gerardo Nuñez", 2022, "IT" )
        );
    }

    public Optional<Book> getBook(@PathParam("id") int id) {
        return getAllBooks().stream().filter(book -> book.id==id).findFirst();
    }

}
