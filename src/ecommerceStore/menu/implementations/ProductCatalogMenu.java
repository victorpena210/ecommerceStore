package ecommerceStore.menu.implementations;

import ecommerceStore.menu.Menu;

public class ProductCatalogMenu implements Menu {
	

	@Override
	public void start() {
		printMenuHeader();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** PRODUCT CATALOG ****");
		System.out.println("Enter Product ID to add it to the cart ");
	}

}
