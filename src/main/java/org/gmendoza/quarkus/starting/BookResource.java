package org.gmendoza.quarkus.starting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getBooks() {
        return List.of(
                new Book(1,"Understanding Kotlin", "Geovanny", 2025, "IT" ),
                new Book(2,"Understanding Quarkus", "Omar", 2024, "IT" ),
                new Book(3,"Understanding Java", "Elena", 2023, "IT" )
        );
    }
}
