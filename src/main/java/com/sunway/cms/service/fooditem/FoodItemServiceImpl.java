package com.sunway.cms.service.fooditem;

import com.sunway.cms.entity.fooditems.FoodItems;
import com.sunway.cms.repo.fooditem.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemServiceImpl implements FoodItemService{
    @Autowired
    private FoodItemRepo foodItemRepo;

    @Override
    public FoodItems save(FoodItems foodItems) {
        foodItems = foodItemRepo.save(foodItems);
        return foodItems;
    }
}
