package com.fruitStore.mapper;

import com.fruitStore.dto.ProductDto;
import com.fruitStore.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {

    public ProductDto productEntityToProductDto (Product product){

        ProductDto response = new ProductDto();
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        response.setNumber(product.getNumber());

        return response;

    }

    public List<ProductDto> productListEntityToProductListDto(List<Product> productList){

        List<ProductDto> responseList = new ArrayList<>();
        for(Product product : productList){
            responseList.add(productEntityToProductDto(product));
        }

        return responseList;
    }
}
