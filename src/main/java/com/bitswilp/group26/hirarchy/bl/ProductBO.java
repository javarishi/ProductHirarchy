package com.bitswilp.group26.hirarchy.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitswilp.group26.hirarchy.dao.ProductRepo;
import com.bitswilp.group26.hirarchy.to.Product;

@Component
public class ProductBO {
	
	@Autowired
	ProductRepo productRepo;
	
	public Product executeGetProduct(int productId) {
		Product product = productRepo.findById(productId).orElse(new Product());
		return product;
	}

	public Product executeUpdateProduct(Product product) {
		Product savedProduct = productRepo.save(product);
		return savedProduct;
	}

	public void executeDeleteProduct(Product product) {
		productRepo.deleteById(product.getProductId());	
	}

	public Product executeCreateProduct(Product product) {
		Product savedProduct = productRepo.save(product);
		return savedProduct;
	}

	public List<Product> executeGetAllProducts() {
		List<Product> products = productRepo.findAll();
		return products;
	}

}
