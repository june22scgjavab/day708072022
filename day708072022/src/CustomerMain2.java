
public class CustomerMain2 {

	public static void main(String args[]) {
		Customer2 customer = new Customer2();
		
		  customer.customerId = "C101"; customer.customerName = "Stephen Abram";
		  customer.contactNumber = 7856341287L; customer.address =
		  "D089, St. Louis Street, Springfield, 62729";
		 System.out.println(customer.contactNumber);
		 //customer.updateContactNumber(customer);
		 customer.contactNumber=0;
		 System.out.println(customer.contactNumber);
		 
		 float f=2345.4547f;
		 System.out.println(Math.round(f*1000f)/1000f);
	}
}
