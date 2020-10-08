package com.minty.demo;

import com.minty.demo.entities.Product;
import com.minty.demo.repository.ProductRepository;
import com.minty.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class MyAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(MyAppApplication.class, args);
    }

    @Autowired
    private ProductService productService;

    @Override
    public void run(String... args) throws Exception {

    }
}
