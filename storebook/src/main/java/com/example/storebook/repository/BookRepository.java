package com.example.storebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.storebook.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
