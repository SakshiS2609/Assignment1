package Assignment2;

public class CustomerMain {

		public static void main(String[] args) {
			CustomerService customerService = new CustomerService();
			try {
				customerService.getCustomer(2);
			} catch (CustomerNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}


