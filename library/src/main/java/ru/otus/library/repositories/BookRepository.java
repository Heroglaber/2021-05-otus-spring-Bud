package ru.otus.library.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.otus.library.models.domain.Book;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitle(String title);
}