package byte_bank;

public class TestingBank {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.setName("Guilherme Nunes");
		customer.setDocument("222.222.222-22");
		customer.setProfession("Programador");
		
		Account account = new Account(0,0);
		
		account.deposit(100);
		
		account.customer = customer;
		
		System.out.println(account.customer.getName());
	}
}
