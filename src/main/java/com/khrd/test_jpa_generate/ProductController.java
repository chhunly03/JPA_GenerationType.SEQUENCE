package com.khrd.test_jpa_generate;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @PostMapping("product")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
