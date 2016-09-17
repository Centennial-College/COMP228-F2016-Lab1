package exercise1;

/**
 * This class will be the blueprint for the Patient object
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file Patient.java
 *
 */
public class Patient {

	// Create a class Patient that contains instance variables for patient id,
	// first name, last name, address, city, province, postal code. Provide also
	// multiple argument constructor to allow the initialization instance
	// variables. Provide all getter and setter methods. Provide also a default
	// constructor. Provide a getPatientInfo method to return patient's data in
	// a nicely formatted string.

	// INSTANCE VARIABLES
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int _patientID;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private String _postalCode;

	// CONSTRUCTORS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Patient(int patientID, String firstName, String lastName, String address, String city, String province,
			String postalCode) {
		this.setPatientID(patientID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setCity(city);
		this.setProvince(province);
		this.setPostalCode(postalCode);
	}

	// Default Constructor
	public Patient() {
		this(0, "", "", "", "", "", "");
	}

	// GETTER AND SETTER METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getPatientID() {
		return this._patientID;
	}

	public void setPatientID(int patientID) {
		this._patientID = patientID;
	}

	public String getFirstName() {
		return this._firstName;
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}

	public String getLastName() {
		return this._lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public String getAddress() {
		return this._address;
	}

	public void setAddress(String address) {
		this._address = address;
	}

	public String getCity() {
		return this._city;
	}

	public void setCity(String city) {
		this._city = city;
	}

	public String getProvince() {
		return this._province;
	}

	public void setProvince(String province) {
		this._province = province;
	}

	public String getPostalCode() {
		return this._postalCode;
	}

	public void setPostalCode(String postalCode) {
		this._postalCode = postalCode;
	}

	// PUBLIC METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * This method returns patient's data in a nicely formatted string.
	 * 
	 * @public
	 * @method getPatientInfo
	 * @return {String}
	 */
	public String getPatientInfo() {
		String patientInfo = String.format("Patient ID: %d%nPatient Name: %s %s%nAddress: %s, %s, %s %s%n",
				this.getPatientID(), this.getFirstName(), this.getLastName(), this.getAddress(), this.getCity(),
				this.getProvince(), this.getPostalCode());

		return patientInfo;
	}
}
