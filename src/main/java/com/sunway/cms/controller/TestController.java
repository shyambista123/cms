package com.sunway.cms.controller;

import com.sunway.cms.entity.fooditems.FoodItems;
import com.sunway.cms.enums.VegOrNonVegEnum;
import com.sunway.cms.service.fooditem.FoodItemService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam("msg")String msg){
        System.out.println("hello world is calling");
        System.out.println(msg);

        FoodItems foodItems = new FoodItems();
        foodItems.setName("buff momo");
        foodItems.setPrice(100F);
        foodItems.setQuantity(10);
        foodItems.setVegOrNonVeg(VegOrNonVegEnum.NON_VEG);
        foodItemService.save(foodItems);

        return "hello world";
    }
    @GetMapping("/hi")
    public String hi(){return "Hii..";}
}
