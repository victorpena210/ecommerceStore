package ecommerceStore.menu.implementations;

import java.util.Scanner;

import ecommerceStore.configurations.ApplicationContext;
import ecommerceStore.menu.Menu;

public class MainMenu implements Menu {
	
	public static final String MENU_COMMAND = "menu";
	
	private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Please, enter number in console to proceed." + System.lineSeparator()
	+ "1. Sign Up" + System.lineSeparator() + "2. Sign In"
	+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
	+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + 
	"6. Customer List";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Please, enter number in console to proceed." + System.lineSeparator()
	+ "1. Sign Up" + System.lineSeparator() + "2. Sign Out"
	+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
	+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + 
	"6. Customer List";
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		while(true) {
			if (context.getMainMenu() == null) {
				context.setMainMenu(this);
			}
			
			Menu menuToNavigate = null;
			mainLoop: while(true) {
				printMenuHeader();
			}
		}

	}

	@Override
	public void printMenuHeader() {
		System.out.println("*** MAIN MENU ***");
		if (context.getLoggedInUser() == null) {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);
		} else {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);
		}
	}

}
