package vn.com.hellospringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.hellospringmvc.dao.BookDAO;
import vn.com.hellospringmvc.model.Book;
@Service
	public class BookServiceImpl implements BookService {

		@Autowired
		private BookDAO bookDAO;
		public List<Book> getBooks() {
			return bookDAO.getBooks();
		}
		
		public Book getBook(int id) {
			return bookDAO.getBook(id);
		}
		
		public void createBook(Book book) {
			bookDAO.createBook(book);
		}
		public void deleteBook(int id) {
			Book book = bookDAO.getBook(id);
			if(book!=null) {
				bookDAO.deleteBook(book);
			}else {
				System.out.println("EROOR");
			}
				
		}
		public void updateBook(Book book) {
			bookDAO.updateBook(book);
		}
		public List<Book> searchBook(String book) {
			return bookDAO.searchBook(book);
		}
}

