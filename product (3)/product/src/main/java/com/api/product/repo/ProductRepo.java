package com.api.product.repo;

import com.api.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepo extends JpaRepository<Product, Integer> {

}
