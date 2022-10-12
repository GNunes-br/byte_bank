package byte_bank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account(0,0);
		
		firstAccount.deposit(200);
		
		System.out.println(firstAccount.getBalance());
		
		firstAccount.deposit(100);
		
		System.out.println(firstAccount.getBalance());
		
		Account secondAccount = new Account(0,0);
		
		secondAccount.deposit(50);
		
		System.out.println("Saldo primeira conta = " + firstAccount.getBalance());
		
		System.out.println("Saldo segunda conta = " + secondAccount.getBalance());	
		
		System.out.println(firstAccount.getAgency());
		
		System.out.println(firstAccount.getNumber());
		
		System.out.println(secondAccount.getAgency());
		
		secondAccount.setAgency(146);
		
		System.out.println(secondAccount.getAgency());
		
		secondAccount.deposit(300);
		
		firstAccount.setAgency(146);
		
		if(firstAccount == secondAccount) {
			System.out.println("Sao a mesma conta!");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
