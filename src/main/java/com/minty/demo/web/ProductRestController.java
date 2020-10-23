package com.minty.demo.web;

import com.minty.demo.entities.Product;
import com.minty.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product p = new Product("Great success", 120);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
//        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable(name="productId") Long productId) {
        Product p = new Product("Great success", 120);
//        return new ResponseEntity<>(productService.getProduct(productId), HttpStatus.OK);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @PutMapping("/products")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        Product p = new Product("Great success", 120);
//        return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.OK);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable(name="productId") Long productId) {
//        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductList() {
        Product p1 = new Product("Great success 1", 120);
        Product p2 = new Product("Great success 2", 130);
        Product p3 = new Product("Great success 3", 140);
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(p1);
        listProducts.add(p2);
        listProducts.add(p3);
//        return new ResponseEntity<List<Product>> (productService.getProductList(), HttpStatus.OK);
        return new ResponseEntity<List<Product>> (listProducts, HttpStatus.OK);
    }
}
