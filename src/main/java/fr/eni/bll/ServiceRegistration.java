package fr.eni.bll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.eni.bo.User;


public interface ServiceRegistration {

	User registration (String lastName, String firstName, String email,
			String phoneNumber, String password, String street, 
			String zipCode, String city);

	void saveUser(User user);
	
	
	
}
