package io.bayrktlihn.productservice;

import io.bayrktlihn.productservice.entity.Product;
import io.bayrktlihn.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class ProductServiceApplication implements CommandLineRunner {

    private final ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setDescription("Ürün açıklaması");
        product.setName("Ürün adı");
        product.setPrice(new BigDecimal("100"));
        productRepository.save(product);
    }
}
