package byte_bank;

public class TestingReference {
	public static void main(String[] args) {
		Account firstAccount = new Account(0,0);
		firstAccount.deposit(300);
		System.out.println("Saldo da primeira conta = " + firstAccount.getBalance());
		
		Account secondAccount = firstAccount;
		System.out.println("Saldo da segunda conta = " + secondAccount.getBalance());
		
		secondAccount.deposit(100);
		System.out.println("Saldo da segunda conta = " + secondAccount.getBalance());

		System.out.println("Saldo da primeira conta = " + firstAccount.getBalance());
		
		if(firstAccount == secondAccount) {
			System.out.println("Sao a mesma conta!");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
