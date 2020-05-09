package com.test.postgresql.repository;

import com.test.postgresql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, String> {
}
