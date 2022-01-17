package inheritance.product.dbapp;

public class Book extends Product {

	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
		super();
		author=" ";
		count++;
			}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + author;
	}
	
}
