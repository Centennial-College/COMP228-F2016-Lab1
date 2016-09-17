/**
 * This will be the driver class to test the implementation of the BankAccount class
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file BankAccountTest.java
 *
 */
package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {

		// Write a driver class to test the bank account. The driver class (main
		// class) interacts with the user and calls BankAccount methods to
		// initialize or update the account.
		// Use the methods of JOptionPane class to provide input/output in the
		// driver class.

		// VARIABLE DECLARATIONS
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int accountNumber;
		String ownerName;
		double balance;
		double amount;
		BankAccount aBankAccount;

		// Instantiating objects from BankAccount class
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// prompting user input using JOptionPane class
		accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the account number: "));
		ownerName = JOptionPane.showInputDialog("Please enter the name of the owner of the account: ");
		balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the initial balance of the account: "));

		// Invoking the BankAccount constructor to instantiate a BankAccount
		// object
		aBankAccount = new BankAccount(accountNumber, ownerName, balance);

		// Invoking public methods of the BankAccount class
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		// Initial State post initialization
		JOptionPane.showMessageDialog(null,
				String.format("Initial Bank account status: %n%s%n%s%n",
						"----------------------------------------------------------------------",
						aBankAccount.getAccountInfo()));

		// Invoking withdraw method
		amount = Double.parseDouble(JOptionPane
				.showInputDialog("Please enter the amount of money you wish to withdraw from your account: "));
		aBankAccount.withdraw(amount);
		JOptionPane.showMessageDialog(null,
				String.format("Bank account status: %n%s%n%s%n",
						"----------------------------------------------------------------------",
						aBankAccount.getAccountInfo()));

		// Invoking deposit method
		amount = Double.parseDouble(JOptionPane
				.showInputDialog("Please enter the amount of money you wish to deposit into your account: "));
		aBankAccount.deposit(amount);
		JOptionPane.showMessageDialog(null,
				String.format("Bank account status: %n%s%n%s%n",
						"----------------------------------------------------------------------",
						aBankAccount.getAccountInfo()));

	}

}
