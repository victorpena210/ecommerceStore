package ecommerceStore.services;

import ecommerceStore.entities.Product;

public interface ProductManagementService {
	
	Product[] getProducts();
	
	Product getProductById(int productIdToAddToCart);

}
