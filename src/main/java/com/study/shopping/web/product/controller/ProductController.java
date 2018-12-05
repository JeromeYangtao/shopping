package com.study.shopping.web.product.controller;

import com.study.shopping.web.product.model.Product;
import com.study.shopping.web.product.model.ProductDao;
import com.study.shopping.web.product.view.ListProductResponse;
import com.study.shopping.web.product.view.create.CreateProductRequest;
import com.study.shopping.web.product.view.create.CreateProductResponse;
import com.study.shopping.web.product.view.update.UpdateProductRequest;
import com.study.shopping.web.product.view.update.UpdateProductResponse;
import com.study.shopping.web.product.view.create.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ProductController {

    private ProductDao productDao;
    private CreateProductRequestValidator createProductRequestValidator;

    public ProductController(CreateProductRequestValidator createProductRequestValidator, ProductDao productDao) {
        this.createProductRequestValidator = createProductRequestValidator;
        this.productDao = productDao;
    }

    /**
     * List products
     */
    @GetMapping("/products")
    public ResponseEntity<com.study.shopping.web.product.view.ListProductResponse> listProducts() {
        List<Product> products = productDao.findAll();
        return new ResponseEntity<>(new ListProductResponse(products), HttpStatus.OK);
    }

    /**
     * Get products
     */
    @GetMapping("/products/{productId}")
    public ResponseEntity<com.study.shopping.web.product.view.GetProductResponse> getProduct(@PathVariable Long productId) throws SQLException {
        Product product = productDao.getById(productId);
        return new ResponseEntity<>(new com.study.shopping.web.product.view.GetProductResponse(product), HttpStatus.OK);
    }

    /**
     * Create products
     */
    @PostMapping("/products")
    public ResponseEntity<CreateProductResponse> CreateProduct(@RequestBody CreateProductRequest createProductRequest) {
        boolean validate = createProductRequestValidator.validate(createProductRequest);

        Product product = new Product(createProductRequest.getName(), createProductRequest.getDescription(), createProductRequest.getPrice());
        product = productDao.save(product);
        if (validate) {
            return new ResponseEntity<>(new CreateProductResponse(product), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Update products
     */
    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> UpdateProduct(@PathVariable Long productId, @RequestBody UpdateProductRequest updateProductRequest) {
        Product product = productDao.getById(productId);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        product.setName(updateProductRequest.getName());
        product.setDescription(updateProductRequest.getDescription());
        product.setPrice(updateProductRequest.getPrice());
        product = productDao.save(product);
        return new ResponseEntity<>(new UpdateProductResponse(product), HttpStatus.OK);
    }
}
