package com.sunway.cms.entity.fooditems;

import com.sunway.cms.enums.VegOrNonVegEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "food_items")
@Getter
@Setter
public class FoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Float price;
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private VegOrNonVegEnum vegOrNonVeg;
}
