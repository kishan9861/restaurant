/**
 * Controller class
 */

package com.lotus.restaurant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotus.restaurant.dao.RestaurantDao;
import com.lotus.restaurant.entity.RestaurantEntity;
import com.lotus.restaurant.service.RestaurantService;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	/*
	 * create new restaurant
	 */
	@PostMapping("/createrestaurant")
	public RestaurantEntity createTutorial(@RequestBody RestaurantDao rstDetails) {
		return restaurantService.createRestaurant(rstDetails);

	}

	/**
	 * retrieve restaurant details based on id
	 * 
	 * @param id
	 * @return
	 */

	@GetMapping(value = "/getrestaurantbyid/{id}")
	public Optional<RestaurantEntity> getRestaurantById(@PathVariable("id") long id) {
		Optional<RestaurantEntity> resp = restaurantService.getRestauntDetailsById(id);
		return resp;

	}

	/**
	 * retrieve all the restaurant details
	 * 
	 * @return
	 */

	@GetMapping(value = "/getallrestaurant")
	public List<RestaurantEntity> getRestaurants() {
		List<RestaurantEntity> resp = restaurantService.getAllRestaurant();
		return resp;

	}

	/**
	 * Update the restaurant details
	 * 
	 * @return
	 */

	@PutMapping(value = "/updaterestaurant/{id}")
	public RestaurantEntity updateRestaurant(@PathVariable(value = "id") long id,
			@RequestBody RestaurantDao restaurantDto) {
		RestaurantEntity resp = restaurantService.updateRestaurant(id, restaurantDto);
		return resp;

	}

}
