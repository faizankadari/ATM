package com.atm;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	public void getLogin() throws Exception{
		int x=1;
		do {
			try {
				data.put(12345, 7890);
				data.put(908765, 4321);
				System.out.println("Welcome to ATM");
				System.out.println("Enter your Customer Number");
				setCustomerNumber(sc.nextInt());
				System.out.print("Enter your PIN Number: ");
				setPinNumber(sc.nextInt());
			}catch(Exception e) {
				System.out.println("Invalid Number");
				x=2;
			}
			int cn =getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else 
				System.out.println("Wrong number please try again");
		}while(x==1);
		
	}
	private void getAccountType() {
		// TODO Auto-generated method stub
		System.out.println("Select the Account you want to Access :- ");
		System.out.println("Type 1 for Current Account");
		System.out.println("Type 2 for Saving Account");
		System.out.println("Type 3 to Exit");
		
		int selection=sc.nextInt();
				switch(selection) {
				case 1:
					getCurrent();
					break;
				case 2:
					getSaving();
					break;

				case 3:
					System.out.println("Thank You for using this ATM, bye.  \n");
					break;

				default:
					System.out.println("\n" + "Invalid Choice." + "\n");
					getAccountType();
				}
		
	}
	private void getCurrent() {
		System.out.println("Current Account: ");
		System.out.println(" Type 1 :- View Balance");
		System.out.println(" Type 2 :- Withdraw Funds");
		System.out.println(" Type 3 :- Deposit Funds");
		System.out.println(" Type 4 :- For Fixed Deposit");
		System.out.println(" Type 5 :- To Exit");
		System.out.print("Choice: ");
		
		int selection=sc.nextInt();
		
		switch(selection)  {
		
		case 1:
			System.out.println("Current Account Balance " + moneyFormat.format(getCurrentBalance()));
			getAccountType();
			break;
			
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;

		case 4:
			getCurrentFixedDeposit();
			getAccountType();
			break;

		case 5:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getCurrent();
		}
		// TODO Auto-generated method stub
		
	}
	private void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println(" Type 1 :- View Balance");
		System.out.println(" Type 2 :- Withdraw Funds");
		System.out.println(" Type 3 :- Deposit Funds");
		System.out.println(" Type 4 :- For Fixed Deposit");
		System.out.println(" Type 5 :- To Exit");
		System.out.print("Choice: ");
		
		int selection=sc.nextInt();
		
		switch(selection)  {
		
		case 1:
			System.out.println("Saving Account Balance " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			getSavingFixedDeposit();
			getAccountType();
			break;

		case 5:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getCurrent();
		}
		// TODO Auto-generated method stub
		
	}
	
	
}
