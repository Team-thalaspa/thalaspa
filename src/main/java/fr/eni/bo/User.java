package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	private String firstName;
	private String lastName;
	private String phoneNumner;
	private String street;
	private String city;
	private String zipCode;
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumner() {
		return phoneNumner;
	}
	public void setPhoneNumner(String phoneNumner) {
		this.phoneNumner = phoneNumner;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public User(long idUser, String firstName, String lastName, String phoneNumner, String street, String city,
			String zipCode) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumner = phoneNumner;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	public User(String firstName, String lastName, String phoneNumner, String street, String city, String zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumner = phoneNumner;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [idUser=");
		builder.append(idUser);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", phoneNumner=");
		builder.append(phoneNumner);
		builder.append(", street=");
		builder.append(street);
		builder.append(", city=");
		builder.append(city);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
