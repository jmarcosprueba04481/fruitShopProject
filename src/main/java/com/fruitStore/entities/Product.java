package com.fruitStore.entities;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Product {

    String name;
    BigDecimal price;
    Integer number;
}
