package com.grv.repositories;

import org.springframework.data.repository.CrudRepository;

import com.grv.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
