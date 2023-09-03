package io.bayrktlihn.productservice.service.impl;

import io.bayrktlihn.productservice.dto.ProductDto;
import io.bayrktlihn.productservice.entity.Product;
import io.bayrktlihn.productservice.mapper.ProductMapper;
import io.bayrktlihn.productservice.repository.ProductRepository;
import io.bayrktlihn.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.productListToProductDtoList(products);
    }


}
