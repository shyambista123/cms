package com.sunway.cms.categorycontroller;

import com.sunway.cms.entity.foodcategory.FoodCategory;
import com.sunway.cms.enums.FoodCategoriesEnum;
import com.sunway.cms.service.foodcategory.FoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private FoodCategoryService foodCategoryService;

    @GetMapping("/hii")
    public String helloWorld(@RequestParam("msg")String msg) {
        System.out.println("hello world is calling");
        System.out.println(msg);

        FoodCategory foodCategory = new FoodCategory();
        foodCategory.setFoodCategories(FoodCategoriesEnum.BREAKFAST);
        foodCategoryService.save(foodCategory);
        return "hii....";
    }
}
