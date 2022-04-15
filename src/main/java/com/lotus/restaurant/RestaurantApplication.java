/**
 * main class
 */
package com.lotus.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;

import com.lotus.restaurant.controller.RestaurantController;
import com.lotus.restaurant.dao.RestaurantDao;
import com.lotus.restaurant.entity.RestaurantEntity;
import com.lotus.restaurant.service.RestaurantService;
import com.lotus.restaurant.utils.RestaurantConverter;

@Import({ RestaurantService.class, RestaurantConverter.class, RestaurantDao.class, RestaurantEntity.class })
@SpringBootApplication
/*
 * @ComponentScan(basePackages = { "com.lotus.restaurant.*",
 * "com.lotus.restaurant.RestaurantController",
 * "com.lotus.restaurant.dao.RestaurantDao",
 * "com.lotus.restaurant.entity.RestaurantEntity",
 * "com.lotus.restaurant.repository",
 * "com.lotus.restaurant.service.RestaurantService",
 * "com.lotus.restaurant.utils.RestaurantConverter" })
 */

@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
public class RestaurantApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestaurantApplication.class, args);

	}

}
