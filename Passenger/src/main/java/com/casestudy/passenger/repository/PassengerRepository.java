package com.casestudy.passenger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.passenger.model.PassengerModel;
@Repository
public interface PassengerRepository extends MongoRepository<PassengerModel,String>  {
	
	

}
