package ecommerceStore.menu.implementations;

import java.util.Scanner;

import ecommerceStore.configurations.ApplicationContext;
import ecommerceStore.entities.Product;
import ecommerceStore.menu.Menu;
import ecommerceStore.services.ProductManagementService;
import ecommerceStore.services.implementations.DefaultProductManagementService;

public class ProductCatalogMenu implements Menu {
	
	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context; 
	private ProductManagementService productManagementService;
	
	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}
	
	@Override
	public void start() {
		Menu menuToNavigate = null;
		while (true) {
			printMenuHeader();
			printProductsToConsole();
		}
	}

	private void printProductsToConsole() {
		Product[] products = productManagementService.getProducts();
		for (Product product : products) {
			System.out.println(product);
		}
		
	}
	
	private String readUserInput() {
		System.out.print("Product ID to add to cart or enter CHECKOUT to proceed with checkout: ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		return userInput;
	}

	@Override
	public void printMenuHeader() {
		System.out.println();
		System.out.println("**** PRODUCT CATALOG ****");
		System.out.println("Enter Product ID to add it to the cart ");
	}

}
