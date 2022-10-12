package byte_bank;

public class Account {
	private double balance;
	private int agency;
	private int number;
	Customer customer;
	private static int total;
	
	public Account (int agency, int number) {
		Account.total++;
		this.setAgency(agency);
		this.setNumber(number);
		System.out.println("O total de contas eh " + Account.total);
	}
		
	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {			
			this.balance -= value;
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfer(double value, Account receiver) {
		if(this.balance >= value) {			
			this.withdraw(value);
			
			receiver.deposit(value);
			
			return true;
		} else {
			return false;
		}
	}
	
	public double getBalance( ) {
		return this.balance;
	}
	
	public int getAgency( ) {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if(agency <= 0) {
			System.out.println("Agencia invalida");
			return;
		}
		this.agency = agency;
	}
	
	public int getNumber( ) {
		return this.number;
	}
	
	public void setNumber(int number) {
		if(number <= 0) {
			System.out.println("Numero invalido");
			return;
		}
		this.number = number;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public static int getTotal( ) {
		return Account.total;
	}
}
