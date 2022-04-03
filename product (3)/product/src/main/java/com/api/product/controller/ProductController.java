package com.api.product.controller;

import com.api.product.models.Product;
import com.api.product.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping(value ="/api/products")
    public List<Product> getProduct(){
        return productRepo.findAll();
    }
    @GetMapping(value = "/api/products/{id}")
    public Product getProducts(@PathVariable("id") int id){
        return productRepo.findById(id).orElse(null);
    }
    @PostMapping(value = "/api/products")
    public Product saveProduct(@RequestBody Product product){
       return productRepo.save(product);

    }
    @PutMapping(value = "/api/products/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product){
        Product updatedProduct = productRepo.findById(id).get();
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setQuantity(product.getQuantity());
        return productRepo.save(updatedProduct);

    }
    @DeleteMapping(value = "/api/products/{id}")
    public String deleteProduct(@PathVariable int id){
        Product deleteProduct = productRepo.findById(id).get();
        productRepo.delete(deleteProduct);
        return "Delete user with the id: "+ id;
    }
}
