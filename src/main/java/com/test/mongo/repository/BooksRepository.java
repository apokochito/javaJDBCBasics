package com.test.mongo.repository;

import com.test.mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Book, String> {
}
