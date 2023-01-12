package fr.eni.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bo.Type;
import fr.eni.dal.DaoType;

@Service
public class ServiceImplType implements ServiceType {

	private DaoType daoType; 
	
	@Autowired
	public ServiceImplType(DaoType daoType) {
		super();
		this.daoType = daoType;
	}


	@Override
	public List<Type> findAll() {
		
		return daoType.findAll();
	}

}
