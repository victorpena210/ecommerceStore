package ecommerceStore.menu.implementations;

import ecommerceStore.configurations.ApplicationContext;
import ecommerceStore.menu.Menu;

public class SignOutMenu implements Menu {
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
	}

	@Override
	public void printMenuHeader() {
		System.out.println();
		System.out.println("**** Sign Out ****");
		System.out.println("goodbye");

	}

}
