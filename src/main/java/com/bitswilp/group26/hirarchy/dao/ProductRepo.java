package com.bitswilp.group26.hirarchy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitswilp.group26.hirarchy.to.Product;


public interface ProductRepo extends JpaRepository<Product, Integer> {

}
