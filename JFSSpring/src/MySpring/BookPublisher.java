package MySpring;

import java.util.List;

public class BookPublisher {
	//Book book;
	List book_list;
	public List getBook_list() {
		return book_list;
	}
	public void setBook_list(List book_list) {
		this.book_list = book_list;
	}
	@Override
	public String toString() {
		return "BookPublisher [book_list="+ book_list +"]";
	}
	

//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}
//
//	@Override
//	public String toString() {
//		return "BookPublisher [book=" + book + "]";
//	}
//	

}
