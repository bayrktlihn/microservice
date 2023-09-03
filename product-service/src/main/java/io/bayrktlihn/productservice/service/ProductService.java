package io.bayrktlihn.productservice.service;

import io.bayrktlihn.productservice.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
}
