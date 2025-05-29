package ecommerceStore.menu.implementations;

import ecommerceStore.configurations.ApplicationContext;
import ecommerceStore.entities.User;
import ecommerceStore.menu.Menu;
import ecommerceStore.services.UserManagementService;
import ecommerceStore.services.implementations.DefaultUserManagementService;

public class CustomerListMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		User[] users = userManagementService.getUsers();
		
		if (users.length == 0) {
			System.out.println("Unfortunately, there are no customers");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** USERS ****");
	}

}
