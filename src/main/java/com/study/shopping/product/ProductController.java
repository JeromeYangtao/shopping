package com.study.shopping.product;

import com.study.shopping.product.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @GetMapping("/product")
    public Product index(){
        return new Product("1","1","2",3);
    }
//    public ResponseEntity<ListProductResponse> listProducts() {
//        return new ResponseEntity<>(new ListProductResponse(), HttpStatus.OK);
//    }
}
