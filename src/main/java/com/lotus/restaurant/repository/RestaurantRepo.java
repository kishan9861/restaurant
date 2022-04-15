package com.lotus.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lotus.restaurant.entity.RestaurantEntity;

@Repository
public interface RestaurantRepo extends JpaRepository<RestaurantEntity, Long> {

}
