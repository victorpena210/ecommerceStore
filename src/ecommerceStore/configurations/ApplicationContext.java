package ecommerceStore.configurations;

import ecommerceStore.entities.User;
import ecommerceStore.entities.implementations.DefaultCart;
import ecommerceStore.menu.Menu;
import ecommerceStore.entities.Cart;

public class ApplicationContext {
	
	private static ApplicationContext instance;
	
	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;
	
	private ApplicationContext() {}

	
	public void setLoggedInUser(User user) {
		if(this.sessionCart != null) {
			this.sessionCart.clear();
		}
		this.loggedInUser = user;
	}
	
	public User getLoggedInUser() {
		return this.loggedInUser;
	}
	
	public void setMainMenu(Menu menu) {
		this.mainMenu = menu;
	}
	
	public Menu getMainMenu() {
		return this.mainMenu;
	}
	
	public static ApplicationContext getInstance() {
		if (instance == null) {
			instance = new ApplicationContext();
		}
		return instance; 
	}
	
	public Cart getSessionCart() {
		if (this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}

}
