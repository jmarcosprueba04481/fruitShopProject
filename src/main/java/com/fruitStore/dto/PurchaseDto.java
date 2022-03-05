package com.fruitStore.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PurchaseDto {

    List<ProductDto> productList;
    BigDecimal totalAmount;
    List<OfferDto> Discount;
}
