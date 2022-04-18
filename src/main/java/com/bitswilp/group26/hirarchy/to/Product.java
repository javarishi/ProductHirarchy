package com.bitswilp.group26.hirarchy.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * CREATE TABLE `product` (
  `id` int NOT NULL,
  `product_code` varchar(45) DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  `product_description` varchar(45) DEFAULT NULL,
  `product_price` varchar(45) DEFAULT NULL,
  `pack_size` varchar(45) DEFAULT NULL,
  `is_active` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

 */

@Entity
@Table(name = "product")
public class Product {
	
	@Id @Column(name = "id")
	@GeneratedValue(generator = "native")
	private int productId;
	
	@Column(name = "product_code")
	private String productCode;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "productDescription")
	private String product_description;
	
	@Column(name = "productPrice")
	private String product_price;
	
	@Column(name = "pack_size")
	private String packSize;
	
	@Column(name = "is_active")
	private String isActive;

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the product_description
	 */
	public String getProduct_description() {
		return product_description;
	}

	/**
	 * @param product_description the product_description to set
	 */
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	/**
	 * @return the product_price
	 */
	public String getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	/**
	 * @return the packSize
	 */
	public String getPackSize() {
		return packSize;
	}

	/**
	 * @param packSize the packSize to set
	 */
	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}

	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
}