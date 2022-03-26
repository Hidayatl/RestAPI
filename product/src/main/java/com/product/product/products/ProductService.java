package com.product.product.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    public Object updateProduct;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getProducts(){
       return productRepository.findAll();
    }

    public void addNewproduct(Product product) {
        Optional<Product> productOptional = productRepository
                .findProductById(product.getId());
        if (productOptional.isPresent()){
            throw new IllegalStateException("Error");
        }
        productRepository.save(product);
    }

    public void deleteProduct(Long id_product) {
         boolean exists = productRepository.existsById(id_product);
         if (!exists) {
             throw new IllegalStateException(
                     "student with id " + id_product + " does not exists");
         }
             productRepository.deleteById(id_product);
         }
    @Transactional
    public void updateProduct(Long id_product, String name, Integer price, Integer quantity) {
        Product product = productRepository.findById(id_product)
                .orElseThrow(() -> new IllegalStateException(
                        "product with id" + id_product + " does not exist."
                ) );

    }
}

