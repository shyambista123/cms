package com.sunway.cms.repo.foodcategory;

import com.sunway.cms.entity.foodcategory.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategoryRepo extends JpaRepository<FoodCategory,Integer> {

}
