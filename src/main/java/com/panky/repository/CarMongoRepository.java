package com.panky.repository;


import org.springframework.data.repository.CrudRepository;

import com.panky.model.Car;



public interface CarMongoRepository extends CrudRepository<Car,String>{}