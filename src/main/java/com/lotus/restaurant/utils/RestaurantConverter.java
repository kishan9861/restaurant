package com.lotus.restaurant.utils;

import org.springframework.beans.factory.annotation.Autowired;

import com.lotus.restaurant.dao.RestaurantDao;
import com.lotus.restaurant.entity.RestaurantEntity;

public class RestaurantConverter {

	@Autowired
	private RestaurantEntity rstEntity;

	public RestaurantEntity restaurantEntityconvert(RestaurantDao rstDetails) {
		rstEntity = new RestaurantEntity();
		rstEntity.setBranch(rstDetails.getBranch());
		rstEntity.setDescription(rstDetails.getDescription());
		rstEntity.setIsopen(rstDetails.getIsopen());
		rstEntity.setName(rstDetails.getName());
		return rstEntity;
	}

}
