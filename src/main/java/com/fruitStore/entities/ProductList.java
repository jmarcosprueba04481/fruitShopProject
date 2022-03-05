package com.fruitStore.entities;

import com.fruitStore.dto.ProductDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProductList {

    List<ProductDto> products;
}
