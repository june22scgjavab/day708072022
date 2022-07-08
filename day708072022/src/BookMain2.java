
public class BookMain2 {

	public static void main(String[] args) {
		Book2 book1=new Book2();
		book1.setId(1);
		book1.setTitle("Hibernate");
		book1.setPrice(500);
		//book1.setDiscount(0.5f);
		book1.setAuthor("Nick");
		Book2 book2=new Book2();
		book2.setId(2);
		book2.setTitle("Java");
		book1.setPrice(200);
		book1.setAuthor("John");
		System.out.println(book1.getId());
		System.out.println(book1.getTitle());
		
	}

}
