
public class Book1 {

	private int id;
	private String title;
	private float price;
	private float discount;
	public void setData(int id,String title, float price,float discount)
	{
		this.id=id;
		this.title=title;
		this.discount=discount;
	}
	
	public void dispData() {
		System.out.println(id);
		System.out.println(title);
		System.out.println(discount);
	}
}
