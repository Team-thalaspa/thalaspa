package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="table_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	private String lastName;
	private String firstName;
	private String email;
	private String phoneNumber;
	private String password;
	private String street;
	private String zipCode;
	private String city;
	private boolean admin = false;
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public User(long idUser, String lastName, String firstName, String email, String phoneNumber, String password,
			String street, String zipCode, String city, boolean admin) {
		super();
		this.idUser = idUser;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.admin = admin;
	}
	public User(String lastName, String firstName, String email, String phoneNumber, String password, String street,
			String zipCode, String city, boolean admin) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.admin = admin;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [idUser=");
		builder.append(idUser);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", password=");
		builder.append(password);
		builder.append(", street=");
		builder.append(street);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", city=");
		builder.append(city);
		builder.append(", admin=");
		builder.append(admin);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}