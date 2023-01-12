package fr.eni.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bo.User;
import fr.eni.dal.DaoUser;

@Service
public class ServiceImplRegistration implements ServiceRegistration{

	private DaoUser daoUser;
	
	@Autowired
	public ServiceImplRegistration (DaoUser daoUser) {
		this.daoUser=daoUser;
	}
	
	@Override
	public User registration(String lastName, String firstName, String email, String phoneNumber, String password,
			String street, String zipCode, String city) {
		
		return null;
	}

	@Override
	public void saveUser(User user) {
		daoUser.save(user);
		
	}

	
	
	
}
