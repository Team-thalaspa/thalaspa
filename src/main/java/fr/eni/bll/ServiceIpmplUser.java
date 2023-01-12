//package fr.eni.bll;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import fr.eni.bo.User;
//import fr.eni.dal.DaoUser;
//
//@Service
//public class ServiceIpmplUser implements ServiceUser {
//
//	private DaoUser daoUser ;
//	
//	
//	@Autowired
//	public ServiceIpmplUser(DaoUser daoUser) {
//		super();
//		this.daoUser = daoUser;
//	}
//
//	@Override
//	public Optional<User> getCart(Long id) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}
//
//	@Override
//	public List<User> getUserAll() {
//		
//		List<User> lstUsers = daoUser.findAll();
//		
//		for (User user : lstUsers) {
//			System.out.println("liste est vide " + user);
//		}
//		 
//		return daoUser.findAll();
//	}
//
//	@Override
//	public void deleteUser(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public User saveUser(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
//
//}
