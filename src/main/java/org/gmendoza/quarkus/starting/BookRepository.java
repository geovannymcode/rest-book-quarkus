package org.gmendoza.quarkus.starting;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.PathParam;
import java.util.List;
import java.util.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class BookRepository {

  @ConfigProperty(name = "books.genre", defaultValue = "Sci-Fi")
  String genre;

  public List<Book> getAllBooks() {
    return List.of(
        new Book(1, "Understanding Kotlin", "Geovanny Mendoza", 2025, genre),
        new Book(2, "Understanding Quarkus", "Omar Berroteran", 2024, genre),
        new Book(3, "Understanding Java", "Elena Aguirre", 2023, genre),
        new Book(4, "Effective Java in Action", "Gerardo Nuñez", 2022, genre));
  }

  public Optional<Book> getBook(@PathParam("id") int id) {
    return getAllBooks().stream().filter(book -> book.id == id).findFirst();
  }
}
