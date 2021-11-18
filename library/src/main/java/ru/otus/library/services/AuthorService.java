package ru.otus.library.services;

import ru.otus.library.models.dto.AuthorDTO;
import ru.otus.library.models.dto.BookDTO;
import ru.otus.library.models.dto.GenreDTO;

import java.util.List;

public interface AuthorService {
    List<AuthorDTO> getAll();
    AuthorDTO get(AuthorDTO authorDTO);
    AuthorDTO add(AuthorDTO authorDTO);
    AuthorDTO getOrAdd(AuthorDTO authorDTO);
    AuthorDTO update(AuthorDTO authorDTO);
    void addBook(AuthorDTO authorDTO, BookDTO bookDTO);
    void deleteBook(AuthorDTO authorDTO, BookDTO bookDTO);
    AuthorDTO delete(String id);
}