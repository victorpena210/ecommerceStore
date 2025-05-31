package ecommerceStore.menu.implementations;

import java.util.Scanner;

import ecommerceStore.configurations.ApplicationContext;
import ecommerceStore.menu.Menu;
import ecommerceStore.services.UserManagementService;
import ecommerceStore.services.implementations.DefaultUserManagementService;
import ecommerceStore.entities.*;
import ecommerceStore.entities.implementations.*;

public class SignUpMenu implements Menu {
	
	private UserManagementService userManagementService;
	private ApplicationContext context;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
		
	}
	

	@Override
	public void start() {
		printMenuHeader();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = scanner.next();
		System.out.print("Please, enter your last name: ");
		String lastName = scanner.next();
		System.out.print("Please, enter your password: ");
		String password = scanner.next();
		System.out.print("Please, enter your email: ");
		
		scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		
		User user = new DefaultUser(firstName, lastName, password, email);
		userManagementService.registerUser(user);
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println();
		System.out.println("**** SIGN UP ****");
		
	}
	
}