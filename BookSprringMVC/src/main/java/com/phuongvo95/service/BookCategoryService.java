package com.phuongvo95.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phuongvo95.DAO.BookCategoryRepository;
import com.phuongvo95.models.BookCategory;

@Service
public class BookCategoryService {
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	public List<BookCategory> lietke(){
		return bookCategoryRepository.findAll();
	}
}
