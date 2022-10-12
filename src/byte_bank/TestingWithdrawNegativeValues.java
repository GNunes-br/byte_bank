package byte_bank;

public class TestingWithdrawNegativeValues {
	public static void main(String[] args) {
		Account account = new Account(0,0);
		
		account.deposit(100);
		account.withdraw(200);
		
		System.out.println(account.getBalance());
	}
}
