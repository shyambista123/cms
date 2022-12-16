package com.sunway.cms.repo.fooditem;

import com.sunway.cms.entity.fooditems.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItems,Integer> {

}
