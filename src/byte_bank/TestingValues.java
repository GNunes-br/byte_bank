package byte_bank;

public class TestingValues {
	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		
		System.out.println(account.getAgency());
		System.out.println(account.getNumber());
		
		new Account(0,0);
		new Account(0,0);
		new Account(0,0);
		new Account(0,0);
		new Account(0,0);
		
		System.out.println(Account.getTotal());
	}
}
