package com.github.juangabrielcoder.restwithspringbootandjavaerudio.repository;


import com.github.juangabrielcoder.restwithspringbootandjavaerudio.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}