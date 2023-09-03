package io.bayrktlihn.productservice.mapper;


import io.bayrktlihn.productservice.dto.ProductDto;
import io.bayrktlihn.productservice.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto productToProductDto(Product product);

    List<ProductDto> productListToProductDtoList(List<Product> products);

}
