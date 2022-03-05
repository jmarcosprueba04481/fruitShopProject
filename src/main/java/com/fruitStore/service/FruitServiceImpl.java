package com.fruitStore.service;

import com.fruitStore.dto.ProductDto;
import com.fruitStore.entities.Product;
import com.fruitStore.mapper.ProductMapper;
import com.fruitStore.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;
    private final ProductMapper productMapper;

    public FruitServiceImpl(FruitRepository fruitRepository, ProductMapper productMapper) {
        this.fruitRepository = fruitRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDto> getProductList(){

        List<Product> productsEnt = fruitRepository.getProductList();
        List<ProductDto> products = productMapper.productListEntityToProductListDto(productsEnt);
        return products;

    }
}
