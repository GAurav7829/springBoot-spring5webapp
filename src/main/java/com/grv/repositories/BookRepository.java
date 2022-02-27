package com.grv.repositories;

import org.springframework.data.repository.CrudRepository;

import com.grv.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
