package com.minty.demo.interfaces;

import com.minty.demo.entities.Product;

import java.util.List;

public interface ProductInterface {

    public Product addProduct(Product product);

    public Product getProduct( Long productId);

    public Product updateProduct(Product product);

    public void deleteProduct(Long productId);

    public List<Product> getProductList();
}
