package com.phuongvo95.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phuongvo95.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
