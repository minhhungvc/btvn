package vn.com.hellospringmvc.dao;


import java.util.List;



import vn.com.hellospringmvc.model.Book;


	public interface BookDAO {
		public List<Book> getBooks();
		public void createBook(Book book);
		public Book getBook(int id);
		public void deleteBook(Book book);
		public void updateBook(Book book);
		public List<Book> searchBook(String book);
	}
