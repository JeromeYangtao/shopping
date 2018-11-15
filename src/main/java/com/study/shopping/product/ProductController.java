package com.study.shopping.product;

import com.study.shopping.Property;
import com.study.shopping.product.model.*;
import com.study.shopping.product.validator.CreateProductRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class ProductController {

    private CreateProductRequestValidator createProductRequestValidator;

    public ProductController(CreateProductRequestValidator createProductRequestValidator) {
        this.createProductRequestValidator = createProductRequestValidator;
    }

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
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable String productId) throws SQLException {
        return new ResponseEntity<>(new GetProductResponse(), HttpStatus.OK);
    }

    /**
     * Create products
     */
    @PostMapping("/products")
    public ResponseEntity<CreateProductResponse> CreateProduct(@RequestBody CreateProductRequest createProductRequest) {
        boolean validate = createProductRequestValidator.validate(createProductRequest);
        if (validate) {
            return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.BAD_REQUEST);
        }

    }

    /**
     * Update products
     */
    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> UpdateProduct(@PathVariable String productId, @RequestBody UpdateProductRequest updateProductRequest) {
        return new ResponseEntity<>(new UpdateProductResponse(), HttpStatus.OK);
    }
}
