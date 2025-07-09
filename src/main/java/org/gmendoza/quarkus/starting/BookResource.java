package org.gmendoza.quarkus.starting;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
import org.jboss.logging.Logger;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

  @Inject BookRepository bookRepository;
  @Inject Logger logger;

  @GET
  public List<Book> getAllBooks() {
    logger.info("Returns all the books");
    return bookRepository.getAllBooks();
  }

  @GET
  @Path("{id}")
  public Optional<Book> getBook(@PathParam("id") int id) {
    logger.info("Returns book with id " + id);
    return bookRepository.getBook(id);
  }
}
