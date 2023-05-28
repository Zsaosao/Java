package hhh;

import java.time.LocalDate;

public class IDCard {
	private int identificationNumber;
	private String fullName;
	private String gender;
	private String dateOfBirth;
	private String address;
	private int phoneNumber;

	public IDCard(int identificationNumber, String fullName, String gender, String dateOfBirth, String address,
			int phoneNumber) {
		this.identificationNumber = identificationNumber;
		this.fullName = fullName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return identificationNumber + "," + fullName + "," + gender + "," + dateOfBirth + "," + address + ","
				+ phoneNumber;
	}

	public int getAge() {
		String[] components = this.dateOfBirth.split("/");
		int yearold = Integer.parseInt(components[2]);
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		return year - yearold;
	}

}
