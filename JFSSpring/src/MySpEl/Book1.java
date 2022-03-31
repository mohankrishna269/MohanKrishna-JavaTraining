package MySpEl;

public class Book1 {
	int bookId;
	String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book1 [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	

}
