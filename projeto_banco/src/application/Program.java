package application;

import entiteis.Account;
import entiteis.BusinessAcount;
import entiteis.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Petra", 0.0);
		BusinessAcount bcc = new BusinessAcount(1002, "Vanessa", 0.0, 500.0);
		
		// Upcasting
		Account aac1 = bcc;
		Account aac2 = new BusinessAcount(1003, "Bob", 1000.0, 600.0);
		Account aac3 = new SavingsAccount(1005, "Vanessa", 1500.0, 0.01);
		
		// Downcasting
		BusinessAcount acc4 = (BusinessAcount) aac2;
		acc4.loan(400.0);
		
		if (aac3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount) aac3;
			acc5.loan(400.0);
			System.out.println("Loan!");
		}
		
		if (aac3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) aac3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account p1 = new Account(001, "Anna", 1000.0);
		p1.withdraw(200.0);
		System.out.println(p1.getBalance());
		
		Account p2 = new SavingsAccount(002, "Anna", 1000.00, 0.01);
		p2.withdraw(200.0);
		System.out.println(p2.getBalance());
		
		Account p3 = new BusinessAcount(2001, "Anna", 2000.0, 500.0);
		p3.withdraw(200.00);
		System.out.println(p3.getBalance());
	}

}
