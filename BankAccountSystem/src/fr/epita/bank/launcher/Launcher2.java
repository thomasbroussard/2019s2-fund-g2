package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Savings;

public class Launcher2 {

	

	
	
	public static void main(String[] args) {
	
		Savings savingsAccount = new Savings();
		double interrest = savingsAccount.computeInterrest();
		System.out.println(interrest);
		savingsAccount.withDraw(-300000);
		System.out.println(savingsAccount.getBalance());
	
		
	}
	
}
