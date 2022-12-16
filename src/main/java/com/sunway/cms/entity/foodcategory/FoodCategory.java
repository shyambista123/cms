package com.sunway.cms.entity.foodcategory;

import com.sunway.cms.enums.FoodCategoriesEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "food_category")
@Getter
@Setter
public class FoodCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private FoodCategoriesEnum foodCategories;
}
