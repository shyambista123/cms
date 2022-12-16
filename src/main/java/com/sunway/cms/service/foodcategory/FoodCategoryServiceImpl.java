package com.sunway.cms.service.foodcategory;

import com.sunway.cms.entity.foodcategory.FoodCategory;
import com.sunway.cms.repo.foodcategory.FoodCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {
    @Autowired
        private FoodCategoryRepo foodCategoryRepo;

    @Override
    public FoodCategory save(FoodCategory foodCategory) {
        foodCategory = foodCategoryRepo.save(foodCategory);
        return foodCategory;
    }
}
