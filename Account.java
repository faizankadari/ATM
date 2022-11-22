package com.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingBalance = 0;
	
	
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCurrentWithdraw(double amount) {
		// TODO Auto-generated method stub
		currentBalance = (currentBalance - amount);
		return currentBalance;
		
	}

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcSavingFixedDeopsit(double amount) {
		// TODO Auto-generated method stub
		savingBalance = (savingBalance - amount);
		return savingBalance;
		
	}
	
	public double calcCurrentFixedDeopsit(double amount) {
		// TODO Auto-generated method stub
		currentBalance = (currentBalance - amount);
		return currentBalance;
		
	}

	public double calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance + amount);
		return currentBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	public void getSavingDepositInput() {
		System.out.println("Balance of Saving Account is : " + moneyFormat.format(savingBalance));
		System.out.print("The Amount you want to Deposit : ");
		double amount = sc.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("Account Balance after Deposit : " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
		// TODO Auto-generated method stub

	}

	public void getSavingWithdrawInput() {
		System.out.println("Balance of Saving Account is : "+ moneyFormat.format(savingBalance));
		System.out.println("The Amount you want to Withdraw  : ");
		double amount = sc.nextDouble();
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("Account Balance after Withdraw : "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannot be Negative");
		}
		// TODO Auto-generated method stub

	}
	public void getSavingFixedDeposit() {
		System.out.println("Balance of The Account is : " + moneyFormat.format(savingBalance));
		System.out.print("The Amount for you want to do Fixed Deposit for 1 year : ");
		double amount = sc.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingFixedDeopsit(amount);
			System.out.println("Account Balance after Fixed Deposit : " + moneyFormat.format(savingBalance));
			System.out.println("The amount added to Fixed Deposit "+amount);
			System.out.println("Fixed Deposit Balance after 1 year "+ (amount+(amount/10)));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getCurrentFixedDeposit() {
		System.out.println("Balance of The Account is : " + moneyFormat.format(currentBalance));
		System.out.print("The Amount for you want to do Fixed Deposit for 1 year : ");
		double amount = sc.nextDouble();

		if ((currentBalance - amount) >= 0) {
			calcCurrentFixedDeopsit(amount);
			System.out.println("Account Balance after Fixed Deposit : " + moneyFormat.format(currentBalance));
			System.out.println("The amount added to Fixed Deposit "+amount);
			System.out.println("Fixed Deposit Balance after 1 year "+ (amount+(amount/10)));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

	public void getCurrentDepositInput() {
		System.out.println("Balance of Current Account is : " + moneyFormat.format(currentBalance));
		System.out.print("The Amount you want to Deposit from Current Account : ");
		double amount = sc.nextDouble();

		if ((currentBalance + amount) >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("Balance of Current Account is : " + moneyFormat.format(currentBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
		// TODO Auto-generated method stub

	}

	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("Amount you want to withdraw from Current Account: ");
		double amount = sc.nextDouble();

		if ((currentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
		// TODO Auto-generated method stub

	}

	
}
