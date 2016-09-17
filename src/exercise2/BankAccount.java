/**
 * This class will be the blueprint for the BankAccount object
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file BankAccount.java
 *
 */

package exercise2;

import javax.swing.JOptionPane;

public class BankAccount {

	// In this exercise you will develop a Java application that allows the user
	// to process account information. Create a class named BankAccount. A bank
	// account contains information about account number, owner's name, and the
	// balance. Provide a constructor that allows the user to initialize account
	// data. Provide all getter methods. Provide the necessary methods that
	// allow the user to withdraw or deposit money. Provide a getAccountInfo
	// method to return account information in a nicely formatted string.

	// INSTANCE VARIABLES
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int _accountNumber;
	private String _ownerName;
	private double _balance;

	// CONSTRUCTORS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public BankAccount(int accountNumber, String ownerName, double balance) {
		this._accountNumber = accountNumber;
		this._ownerName = ownerName;
		this._balance = balance;
	}

	// GETTER AND SETTER METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getAccountNumber() {
		return this._accountNumber;
	}

	public String getOwnerName() {
		return this._ownerName;
	}

	public double getBalance() {
		return this._balance;
	}

	// PUBLIC METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * This method withdraws money from the account if there is sufficient money
	 * in the account.
	 * 
	 * @public
	 * @method withdraw
	 * @param amount
	 */
	public void withdraw(double amount) {
		if (this._balance < amount) {
			JOptionPane.showMessageDialog(null,
					"ERROR-The amount you are trying to withdraw is greater than the balance of the account.");
		} else {
			this._balance -= amount;
			JOptionPane.showMessageDialog(null, String.format("$%.2f has been withdrawn from the account.", amount));
		}
	}

	/**
	 * This method deposits money into the account.
	 * 
	 * @public
	 * @method deposit
	 * @param amount
	 */
	public void deposit(double amount) {
		this._balance += amount;
		JOptionPane.showMessageDialog(null, String.format("$%.2f has been deposited into the account.", amount));
	}

	/**
	 * This method returns the bank account's info in a nicely formatted string.
	 * 
	 * @public
	 * @method getAccountInfo
	 * @return {String}
	 */
	public String getAccountInfo() {
		String accountInfo = String.format("Account: #%d%nOwner: %s%nBalance: $%.2f", this.getAccountNumber(),
				this.getOwnerName(), this.getBalance());

		return accountInfo;
	}
}
