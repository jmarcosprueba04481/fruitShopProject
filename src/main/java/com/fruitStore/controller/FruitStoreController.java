package com.fruitStore.controller;

import com.fruitStore.dto.ProductDto;
import com.fruitStore.service.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/fruitStore")
public class FruitStoreController {

    private final FruitService fruitService;

    public FruitStoreController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping(path ="/products")
    public ResponseEntity<?> getProductList(){

        List<ProductDto> reponse = fruitService.getProductList();


    };

    @GetMapping(path = "/products/offer")
    public ResponseEntity<?> getProductsOffer(){

    };

    @PostMapping(path = "/purchase")
    public ResponseEntity<?> retrieveProducts(){

    }


}
