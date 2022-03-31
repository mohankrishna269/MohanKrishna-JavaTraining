package MySpring;

public class Book {
	int price;
	String name;
	String author;
	String id;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + ", author=" + author + ", id=" + id + "]";
	}
	
	
//	public void BookDetails() {
//		System.out.println("Price:"+price);
//		System.out.println("Name:"+name);
//		System.out.println("Author:"+author);
//		System.out.println("Id:"+id);
//		
//	}
	
	
//	public void setPrice(int price) {
//		this.price=price;
//	}
//	public void BookPrice() {
//		System.out.println(price);
//	}
//	public void setName(String name) {
//		this.name=name;	
//	}
//	public void BookName() {
//		System.out.println(name);
//	}
//	public void setAuthor(String author) {
//		this.author=author;	
//	}
//	public void BookAuthor() {
//		System.out.println(author);
//	}
//	public void setId(String id) {
//		this.id=id;
//	}
//	public void BookId() {
//		System.out.println(id);
//	}
	
	
	

}
