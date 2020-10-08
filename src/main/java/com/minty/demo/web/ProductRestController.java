package com.minty.demo.web;

import com.minty.demo.entities.Product;
import com.minty.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductRestController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable(name="productId") Long productId) {
        return new ResponseEntity<Product>(productService.getProduct(productId), HttpStatus.OK);
    }

    @PutMapping("/products")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.updateProduct(product), HttpStatus.OK);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable(name="productId") Long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductList() {
        return new ResponseEntity<List<Product>> (productService.getProductList(), HttpStatus.OK);
    }
}
