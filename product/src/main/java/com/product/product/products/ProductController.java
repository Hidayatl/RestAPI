package com.product.product.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    
    @PostMapping
    public void addNewProduct(@RequestBody Product product){
        productService.addNewproduct(product);
    }
    @DeleteMapping(path = "{Id_product}")
    public void deleteProduct(
            @PathVariable("Id_product") Long Id_product){
        productService.deleteProduct(Id_product);
    }
    @PutMapping (path = "{Id_product}")
    public void updateProduct(
            @PathVariable("Id_product") Long Id_product,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer price,
            @RequestParam(required = false) Integer quantity){
        productService.updateProduct(Id_product, name, price, quantity);
    }

}
