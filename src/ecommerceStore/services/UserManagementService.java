package ecommerceStore.services;

import ecommerceStore.entities.User;

public interface UserManagementService {
	
	String registerUser(User user);
	
	User[] getUsers();
	
	User getUserByEmail(String userEmail);

}
