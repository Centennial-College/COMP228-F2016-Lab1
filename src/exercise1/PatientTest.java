package exercise1;

import javax.swing.JOptionPane;

/**
 * This will be the driver class to test the implementation of the Patient class
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file PatientTest.java
 *
 */

public class PatientTest {

	public static void main(String[] args) {
		
		// Write a driver class to test class Patient. Let the user enter
		// patient's data. Instantiate objects of class Patient and call its
		// methods to display the results in a message dialog box. Use the
		// methods of JOptionPane class to provide input/output in the driver
		// class.

		// VARIABLE DECLARATIONS
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int patientID;
		String firstName;
		String lastName;
		String address;
		String city;
		String province;
		String postalCode;
		Patient aPatient;
		Patient anotherPatient;

		// Instantiating objects from Patient class
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// prompting user input using JOptionPane class

		// NOTE: This is all based on the assumption that the user enters in
		// VALID input of the expected data types because we have not covered
		// exception-handling in this course yet.

		patientID = Integer.parseInt(JOptionPane.showInputDialog("Please enter in the patient's ID: "));
		firstName = JOptionPane.showInputDialog("Please enter the patient's first name: ");
		lastName = JOptionPane.showInputDialog("Please enter the patient's last name: ");
		// NOTE: Expected input format for address is "941 Progress Avenue"
		address = JOptionPane.showInputDialog("Please enter the patient's address: ");
		city = JOptionPane.showInputDialog("Please enter the patient's residing city: ");
		// NOTE: Expected input format for province is "ON"
		province = JOptionPane.showInputDialog("Please enter the patient's residing province: ");
		// NOTE: Expected input format for postal code is "N6G 1R4"
		postalCode = JOptionPane.showInputDialog("Please enter the patient's postal code: ");

		// Invoking the multiple argument constructor using user input
		aPatient = new Patient(patientID, firstName, lastName, address, city, province, postalCode);

		// Invoking the default constructor of the Patient class
		anotherPatient = new Patient();

		// Invoking public methods of the Patient class
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		JOptionPane.showMessageDialog(null,
				String.format("Patient Info for Patient instantiated using multiple argument constructor: %n%s%n%s%n",
						"----------------------------------------------------------------------",
						aPatient.getPatientInfo()));
		JOptionPane.showMessageDialog(null,
				String.format("Patient Info for Patient instantiated using default constructor: %n%s%n%s%n",
						"----------------------------------------------------------------------",
						anotherPatient.getPatientInfo()));
	}

}
