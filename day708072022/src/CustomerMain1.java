
public class CustomerMain1 {

	public static void main(String args[]) {
		Customer1 customer = new Customer1();
		/*
		 * customer.customerId = "C101"; customer.customerName = "Stephen Abram";
		 * customer.contactNumber = 7856341287L; customer.address =
		 * "D089, St. Louis Street, Springfield, 62729";
		 */
		customer.displayCustomerDetails();
		//customer.payBill(500, 10);
		double totalBill=customer.payBill(500, 10);
		System.out.println(totalBill);
	}
}
