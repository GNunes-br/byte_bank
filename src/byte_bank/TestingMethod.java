package byte_bank;

public class TestingMethod {
	public static void main(String[] args) {
		Account account = new Account(0,0);
		account.deposit(50);
		
		System.out.println(account.getBalance());
		
		boolean amountWithdrawn = account.withdraw(20);
		
		System.out.println(account.getBalance());
		
		System.out.println("Conseguiu retirar? " + amountWithdrawn);
		
		Account marcelaAccount = new Account(0,0);
		
		account.deposit(1000);
		
		boolean successfulTransfer = account.transfer(300, marcelaAccount);
		
		if (successfulTransfer) {
			System.out.println("Transferencia realizada!");
			
			System.out.println("Meu saldo = " + account.getBalance());
			
			System.out.println("Saldo da Marcela = " + marcelaAccount.getBalance());			
		} else {
			System.out.println("Transferencia nao realizada!");
		}
	}
}
