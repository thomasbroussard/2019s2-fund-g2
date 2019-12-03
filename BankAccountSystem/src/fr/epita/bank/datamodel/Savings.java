package fr.epita.bank.datamodel;

public class Savings extends Account {
	double interrestRate;
	
	
	public double computeInterrest() {
		double interrest = getBalance() * interrestRate;
		
		return interrest;
	}

	
	public void withDraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	
	}
}
