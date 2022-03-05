package com.fruitStore.repository;

import com.fruitStore.mockFruitStoreRepository.OfferProductMock;
import com.fruitStore.mockFruitStoreRepository.ProductResponseMock;
import com.fruitStore.entities.Offer;
import com.fruitStore.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FruitRepositoryImpl implements FruitRepository{

    private final ProductResponseMock productResponseMock;
    private final OfferProductMock offerProductMock;

    public FruitRepositoryImpl(ProductResponseMock productResponseMock, OfferProductMock offerProductMock) {
        this.productResponseMock = productResponseMock;
        this.offerProductMock = offerProductMock;
    }

    @Override
    public List<Product> getProductList(){

        List<Product> productList = new ArrayList<>();

        productList.add(productResponseMock.getPearMock());
        productList.add(productResponseMock.getAppleMock());
        productList.add(productResponseMock.getOrangeMock());

        return productList;

    }

    @Override
    public List<Offer> getProductsOffer(){

        List<Offer> offerList = new ArrayList<>();

        offerList.add(offerProductMock.getOfferPearOrangeMock());
        offerList.add(offerProductMock.getAppleOffer());
        offerList.add(offerProductMock.getDiscountOffer());

        return offerList;

    }


}
