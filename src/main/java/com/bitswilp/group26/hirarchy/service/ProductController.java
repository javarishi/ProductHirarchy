package com.bitswilp.group26.hirarchy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitswilp.group26.hirarchy.bl.ProductBO;
import com.bitswilp.group26.hirarchy.to.Product;


@RestController
public class ProductController {
	
	@Autowired
	private ProductBO productBo;
	
	
	@GetMapping("products")
	public List<Product> getProducts() {
		List<Product> products = productBo.executeGetAllProducts();
		return products;
	};
	
	@GetMapping("product")
	public Product getProduct(@RequestParam("productId") String productId) {
		Product product = productBo.executeGetProduct(Integer.parseInt(productId));
		return product;
	};
	
	
	@PostMapping("product")
	public Product createProduct(@RequestBody Product product) {
		Product savedProduct = productBo.executeCreateProduct(product);
		return savedProduct;
	};
	
	
	@PutMapping("product")
	public Product updateOrder(@RequestBody Product product) {
		Product updatedOrder = productBo.executeUpdateProduct(product);
		return updatedOrder;
	};
	
	
	@DeleteMapping("product")
	public String deleteOrder(@RequestBody Product product) {
		productBo.executeDeleteProduct(product);
		return "Deleted!";
	};
	

}
