package com.phuongvo95.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phuongvo95.models.Book;
import com.phuongvo95.service.BookCategoryService;
import com.phuongvo95.service.BookService;


@Controller
@RequestMapping(value="/")
public class BookController {

	@Autowired
	BookService bookService;
	
	@Autowired
	BookCategoryService bCService;
	
	@RequestMapping(value="lietke")
	public String lietke(Model model){
		model.addAttribute("categories", bCService.lietke());
		model.addAttribute("book", bookService.lietke());
		return "lietke";
	}
	
	@RequestMapping(value="them")
	public String them(Model model){
		model.addAttribute("categories", bCService.lietke());
		model.addAttribute("book", new Book());
		return "them";
	}
	
	@RequestMapping(value="xulithem")
	public String xulithem(@Valid Book book){
		bookService.them(book);
		return "redirect:/lietke";
	}
	
	@RequestMapping(value="xoa/{id}")
	public String xoa(@PathVariable String id){
		bookService.xoa(Integer.parseInt(id));
		return "redirect:/lietke";
	}
	
	@RequestMapping(value="sua/{id}")
	public String sua(@PathVariable String id, Model model){
		model.addAttribute("bookup", bookService.getBookId(Integer.parseInt(id)));
		model.addAttribute("catogery", bCService.lietke());
		return "sua";
	}
	
	@RequestMapping(value="xulisua")
	public String xulisua(@ModelAttribute("bookup") Book book){
		bookService.capnhat(book);
		return "redirect:/lietke";
	}
}
