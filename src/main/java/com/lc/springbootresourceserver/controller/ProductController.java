package com.lc.springbootresourceserver.controller;

import com.lc.springbootresourceserver.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ProductController {

    private static List<Product> products = new LinkedList<>(List.of(
            Product.builder().id("001").name("gpt-1").build(),
            Product.builder().id("002").name("gpt-2").build()
    ));

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProduct() {
        return ResponseEntity.ok(products);
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public ResponseEntity<Void> updateProduct(@RequestBody Product product) {
        products.add(product);
        return ResponseEntity.ok().build();
    }
}
