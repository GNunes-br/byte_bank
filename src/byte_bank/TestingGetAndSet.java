package byte_bank;

public class TestingGetAndSet {
	public static void main(String[] args) {
		Account account = new Account(0,0);
		
		account.setNumber(1337);
		
		System.out.println(account.getNumber());
		
		Customer customer = new Customer();
		
		account.setCustomer(customer);
		
		customer.setName("Guilherme Nunes");
		
		System.out.println(account.getCustomer().getName());
		
		account.getCustomer().setProfession("Programador");
		
		System.out.println(account.getCustomer().getProfession());
	}
}
