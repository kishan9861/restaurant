package com.lotus.restaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.restaurant.dao.RestaurantDao;
import com.lotus.restaurant.entity.RestaurantEntity;
import com.lotus.restaurant.repository.RestaurantRepo;
import com.lotus.restaurant.utils.RestaurantConverter;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepo rstRepo;

	@Autowired
	private RestaurantConverter rstConv;

	public RestaurantEntity createRestaurant(RestaurantDao rstDetails) {
		RestaurantEntity entity = rstConv.restaurantEntityconvert(rstDetails);
		return rstRepo.saveAndFlush(entity);
	}

	public Optional<RestaurantEntity> getRestauntDetailsById(long rstid) {
		Optional<RestaurantEntity> response = rstRepo.findById(rstid);
		return response;
	}

	public List<RestaurantEntity> getAllRestaurant() {
		List<RestaurantEntity> response = rstRepo.findAll();
		return response;

	}

	public RestaurantEntity updateRestaurant(long id, RestaurantDao rstdto) {

		if (rstRepo.findById(id).isPresent()) {
			RestaurantEntity rstent = rstRepo.findById(id).get();
			rstent.setId(id);
			rstent.setBranch(rstdto.getBranch());
			rstent.setDescription(rstdto.getDescription());
			rstent.setIsopen(rstdto.getIsopen());
			rstent.setName(rstdto.getName());
			rstRepo.saveAndFlush(rstent);
			return rstent;
		} else {

			return null;
		}

	}

}
