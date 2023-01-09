package fr.eni.bll;

import org.springframework.stereotype.Service;

import fr.eni.bo.User;

@Service
public interface ServiceConnection {

	User login (String email, String password);
	
	
}
