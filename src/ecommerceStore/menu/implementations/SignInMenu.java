package ecommerceStore.menu.implementations;

import java.util.Scanner;

import ecommerceStore.configurations.ApplicationContext;
import ecommerceStore.entities.User;
import ecommerceStore.menu.Menu;
import ecommerceStore.services.UserManagementService;
import ecommerceStore.services.implementations.DefaultUserManagementService;

public class SignInMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	
	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}
	
	

	@Override
	public void start() {
		printMenuHeader();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, enter your email: ");
		String userEmail = scanner.next();
		System.out.print("Please, enter your password: ");
		String userPassword = scanner.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getFirstName(),
					user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("no such login or password exist");
		}

	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** Sign In ****");
	}

}
