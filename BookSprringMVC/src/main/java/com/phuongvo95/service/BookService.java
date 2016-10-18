package com.phuongvo95.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phuongvo95.DAO.BookRepository;
import com.phuongvo95.models.Book;

@Service
public class BookService {
	
	@Autowired
	BookRepository repository;
	
	public List<Book> lietke(){
		return repository.findAll();
	}
	
	public void them(Book book){
		repository.save(book);
	}
	
	public void xoa(Integer id){
		repository.delete(repository.getOne(id));
	}
	
	public void capnhat(Book book){
		Book bookUpdate=repository.getOne(book.getId());
		bookUpdate.setName(book.getName());
		bookUpdate.setBookCategory(book.getBookCategory());
		repository.save(bookUpdate);
	}
	
	public Book getBookId(int id){
		return repository.getOne(id);
	}
}
