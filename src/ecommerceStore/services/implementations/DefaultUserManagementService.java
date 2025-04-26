package ecommerceStore.services.implementations;

import ecommerceStore.entities.User;
import ecommerceStore.services.*;
public class DefaultUserManagementService implements UserManagementService{

	private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already in use";
	private static final String EMPTY_EMAIL_ERROR_MESSAGE = "PLEASE SUBMIT AN EMAIL TO REGISTER";
	private static final String NO_ERROR_MESSAGE = "";
	
	private static final int DEFAULT_USERS_CAPACITY = 10;
	
	private static DefaultUserManagementService instance;
	
	private User[] users;
	private int lastUserIndex;
	
	{
		users = new User[DEFAULT_USERS_CAPACITY];
	}
	
	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User[] getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
