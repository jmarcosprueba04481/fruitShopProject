package com.fruitStore.repository;



import com.fruitStore.entities.Offer;
import com.fruitStore.entities.Product;

import java.util.List;

public interface FruitRepository {

    List<Product> getProductList();

    List<Offer> getProductsOffer();
}
