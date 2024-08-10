package ATM_Machine;

import java.util.InputMismatchException;

public class User_One_Atm extends Atm_Machine_Genertor {
	int pin;
	int withdraw_amount;
	static int withdraw;
	int amount;
	int deposite;

	public void user_Info() {
		try {
			if (Card_no_user1 == Card_no) {
				while (user_one_pin != pin) {
					System.out.println("Enter your pin :");
					pin = input.nextInt();
					if (user_one_pin != pin) {
						System.err.println("Incorrect pin Please check the pin number :(");
					}
				}
				if (user_one_pin == pin) {
					while (true) {
						System.out.println("------------------------------------");
						System.out.println("Click 1 for Check Balance Enquiry.");
						
						System.out.println("Click 2 for Withdraw Money.");
						System.out.println("Click 3 for Deposite Money");
						System.out.println("Click 4 for Mini Statement");
						System.out.println("Click 5 for Exit");
						System.out.println("\n------------------------------------");
						int Check = input.nextInt();
						switch (Check) {
						case 1:
							amount = getAmount();
							if (withdraw_amount > amount) {

							} else {
								withdraw = amount - withdraw_amount + deposite;
							}

							System.out.println("Account Number      :" + acc_No);
							System.out.println("Account Holder Name :" + user1_name);
							System.out.println("Account Type        :" + user1_acc_Type);
							System.out.println("Balance             :" + withdraw);
							break;
						case 2:
							System.out.println("Enter withdraw amount ");
							withdraw_amount = input.nextInt();
							if (withdraw_amount > amount) {
								System.out.println("Insufficient Amount");
							} else if (withdraw_amount < amount) {
								System.out.println("Successfully Withdraw " + withdraw_amount);
							}

							break;
						case 3:
							System.out.println("Enter Deposite Amount");
							deposite = input.nextInt();
							System.out.println("Successfully Deposite " + deposite);
							break;
						case 4:
							System.out.println("------------Mini Statement------------");
							System.out.println("Account Number      :" + acc_No);
							System.out.println("Account Holder Name :" + user1_name);
							System.out.println("Account Type        :" + user1_acc_Type);
							System.out.println("Withdraw Amount     :" + withdraw_amount);
							System.out.println("Deposite Amount     :" + deposite);
							System.out.println("Balance Amount      :" + withdraw);
							System.out.println("Thank You " + user1_name);
						}
						if (Check == 5) {
							System.out.println("Thank You Welcome"+user1_name);

							break;
						}

					}
				}

			}
		} catch (InputMismatchException in) {
			System.err.println("Please enter proper Number And Again Refresh to Enter");
		}
		finally {
			input.close();
		}
	}

	public static void main(String[] args) {
		User_One_Atm output = new User_One_Atm();
		output.user_Info();

		output.setAmount(withdraw);

	}
}
