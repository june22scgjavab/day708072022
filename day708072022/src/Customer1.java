
public class Customer1 {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
	
	/*
	 * public void payBill(double totalPrice, double discountPercentage) {
	 * System.out.println("Calculating final amount to be paid......"); double
	 * priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
	 * System.out.println("Hi " + customerName +
	 * ", your final bill amount after discount is: " + (int) (priceAfterDiscount *
	 * 100) / 100.0); }
	 */

	
	public double payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		return priceAfterDiscount;
	}

}
