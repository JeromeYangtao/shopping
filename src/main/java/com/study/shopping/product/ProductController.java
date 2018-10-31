package com.study.shopping.product;

import com.study.shopping.product.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    /**
     * List products
     */
    @GetMapping("/products")
    public ResponseEntity<ListProductResponse> listProducts() {
        return new ResponseEntity<>(new ListProductResponse(), HttpStatus.OK);
    }

    /**
     * Get products
     */
    @GetMapping("/products/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable String productId) {
        return new ResponseEntity<>(new GetProductResponse(), HttpStatus.OK);
    }

    /**
     * Create products
     */
    @PostMapping("/products")
    public ResponseEntity<CreateProductResponse> CreateProduct(@RequestBody CreateProductRequest createProductRequest) {
        return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.CREATED);
    }

    /**
     * Update products
     */
    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> UpdateProduct(@PathVariable String productId, @RequestBody UpdateProductRequest updateProductRequest) {
        return new ResponseEntity<>(new UpdateProductResponse(), HttpStatus.OK);
    }
}
