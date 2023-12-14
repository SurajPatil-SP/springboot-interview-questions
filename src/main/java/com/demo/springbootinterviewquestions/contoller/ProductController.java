package com.demo.springbootinterviewquestions.contoller;

import com.demo.springbootinterviewquestions.dto.Product;
import com.demo.springbootinterviewquestions.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/search/{productType}")
    public ResponseEntity<?> getProducts(@PathVariable String productType) {
        List<Product> products = service.getProductByType(productType);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/filter")
    public ResponseEntity<?> findProducts(@RequestParam(value = "productType", required = false, defaultValue = "Electronics") String productType) {
        List<Product> productList = productType != null
                ? service.getProductByType(productType)
                : service.getProducts();
        return ResponseEntity.ok(productList);
    }

    @GetMapping(produces = {"application/json","application/xml"})
    public List<Product> products(@RequestParam(value = "productType", required = false) String productType) {
        return productType != null
                ? service.getProductByType(productType)
                : service.getProducts();
    }
}