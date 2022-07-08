
public class Book2 {

	private int id;
	private String title;
	private float price;
	private float discount;
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}

	
	  public void setPrice(float price) { this.price = price; }
	 
	public float getDiscount() {
		return 0.5f;
	}
	/*
	 * public void setDiscount(float discount) { this.discount = discount; }
	 */
}
