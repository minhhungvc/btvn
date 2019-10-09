package vn.com.hellospringmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.hellospringmvc.model.Book;
import vn.com.hellospringmvc.service.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String hello(Model model) {
		List<Book> bookList = bookService.getBooks();
		System.out.println(bookList.size());
		model.addAttribute("bookList", bookList);
		
		return "bookList";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createBook(Model model) {
		model.addAttribute("book", new Book());
		return "createBook";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createBookAction(@RequestParam("name") String name, 
			@RequestParam("author") String author,
			@RequestParam("publisher") String publisher, 
			@RequestParam("price") int price) {

		Book newBook = new Book();
		newBook.setName(name);
		newBook.setAuthor(author);
		newBook.setPublisher(publisher);
		newBook.setPrice(price);

		bookService.createBook(newBook);

		return "redirect:getall";
	}
	
	@RequestMapping(value = "/createmodel", method = RequestMethod.POST)
	public String createBookActionModel(@ModelAttribute("book") Book book) {
		bookService.createBook(book);

		return "redirect:getall";
	}
	
	@RequestMapping(value = "/deleteBook", method = RequestMethod.GET)
	public String deleteBookActionModel(@RequestParam("id") int id) {
		bookService.deleteBook(id);
		
		return "redirect:getall";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateBook(Model model, @RequestParam("id") int id) {
		Book book = bookService.getBook(id);
		model.addAttribute("book", book);
		return "updateBook";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateBookAction(@ModelAttribute("book") Book book) {
		bookService.updateBook(book);
		return "redirect:getall";
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchBook(Model model, @RequestParam("name") String name) {
		List<Book> book = bookService.searchBook(name);
		model.addAttribute("bookList", book);
		return "bookList";
	}
	
}
