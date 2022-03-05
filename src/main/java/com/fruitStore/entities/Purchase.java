package com.fruitStore.entities;

import com.fruitStore.dto.OfferDto;
import com.fruitStore.dto.ProductDto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Purchase {

    List<ProductDto> productList;
    BigDecimal totalAmount;
    List<OfferDto> Discount;
}
