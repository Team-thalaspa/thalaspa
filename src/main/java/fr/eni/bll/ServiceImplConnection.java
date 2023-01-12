package fr.eni.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bo.User;
import fr.eni.dal.DaoUser;

@Service
public class ServiceImplConnection implements ServiceConnection{
	
	private DaoUser daoUser;
	
	@Autowired
	public ServiceImplConnection (DaoUser daoUser) {
		this.daoUser=daoUser;
	}

	
	@Override
	public User login(String email, String password) {
		
		return daoUser.getUserByEmailAndPassword(email, password);
	}



	
}
