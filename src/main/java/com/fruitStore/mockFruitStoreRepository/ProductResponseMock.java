package com.fruitStore.mockFruitStoreRepository;

import com.fruitStore.entities.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductResponseMock {

    //Real product names
    private static final String PEAR = "pear";
    private static final String APPLE = "apple";
    private static final String ORANGE ="orange";

    //Real Product prices
    public static final BigDecimal PEAR_PRICE = new BigDecimal(0.75);
    public static final BigDecimal APPLE_PRICE = new BigDecimal(0.80);
    public static final BigDecimal ORANGE_PRICE = new BigDecimal(1.0);

    //Example number of Products

    public static final Integer PEAR_NUMBER = 1;
    public static final Integer APPLE_NUMBER = 1;
    public static final Integer ORANGE_NUMBER = 1;

    public Product getPearMock(){

        Product pearMock = Product.builder()
                .name(PEAR)
                .price(PEAR_PRICE)
                .number(PEAR_NUMBER)
                .build();

        return pearMock;
    }

    public Product getAppleMock(){

        Product appleMock = Product.builder()
                .name(APPLE)
                .price(APPLE_PRICE)
                .number(APPLE_NUMBER)
                .build();

        return appleMock;
    }

    public Product getOrangeMock(){

        Product orangeMock = Product.builder()
                .name(ORANGE)
                .price(ORANGE_PRICE)
                .number(ORANGE_NUMBER)
                .build();

        return orangeMock;
    }




}
