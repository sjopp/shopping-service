package com.jopp.shopping.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;

    public Order(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
