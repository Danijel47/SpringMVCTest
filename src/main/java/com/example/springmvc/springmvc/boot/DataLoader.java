package com.example.springmvc.springmvc.boot;

import com.example.springmvc.springmvc.model.Product;
import com.example.springmvc.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Product product1 = new Product();
        product1.setName("Milky Bar");
        product1.setDescription("Milky Bar with chocolate and hazelnut");
        product1.setType("CANDIES");
        product1.setCategory("BARS");
        product1.setPrice(1.99);

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Almond Bar");
        product2.setDescription("Almond bar with chocolate and honey");
        product2.setType("CANDIES");
        product2.setCategory("BARS");
        product2.setPrice(2.99);

        productRepository.save(product2);


    }
}
