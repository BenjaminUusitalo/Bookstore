package com.example.bookstore.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class BookController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String greeting(@RequestParam(name="title") String title, 
			@RequestParam(name ="author") String author,@RequestParam(name="year") String year, 
			@RequestParam(name ="isbn") String isbn,@RequestParam(name ="price") String price, Model book) {
		return "index";   
	}

}
