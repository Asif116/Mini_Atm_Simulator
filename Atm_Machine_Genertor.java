package ATM_Machine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm_Machine_Genertor {

	final int Card_no_user1;
	int Card_no;
	final int user_one_pin;
	private int Amount = 100000;
	final long acc_No = 249900282273l;
	final String user1_name ;
	final String user1_acc_Type = "Savings Account";

	Scanner input = new Scanner(System.in);

	public Atm_Machine_Genertor() {
		System.out.println("Welcome To Atm Genertor" + "\n1.Create the Account ");
		System.out.println("Enter your name ");
		user1_name= input.next();
		System.out.println("Enter the card number ");
		Card_no_user1 = input.nextInt();
		System.out.println("Enter the Pin Number");
		user_one_pin = input.nextInt();
		System.out.println("successfully account created");
		try {
			while (Card_no_user1 != Card_no) {
				System.out.println("Enter your card number : ");
				Card_no = input.nextInt();
				if (Card_no_user1 != Card_no) {
					System.err.println("Incorrect Card Number Please check the pin number :(");
				}
			}
		} catch (InputMismatchException in) {
			System.err.println("Please enter proper Card Number And Again Refresh to Enter");
		}

	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int Amount) {
		this.Amount = Amount;
	}
}
