package byte_bank;

public class TestingAccountWithoutCustomer {
	public static void main(String[] args) {
		Account account = new Account(0,0);
		
		System.out.println(account.getBalance());
		
		System.out.println(account.customer);
		
		account.customer = new Customer();
		
		account.customer.setName("Marcela");
		
		System.out.println(account.customer.getName());
	}
}
