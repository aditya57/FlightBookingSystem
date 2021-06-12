package com.casestudy.passenger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.passenger.model.PassengerModel;
import com.casestudy.passenger.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository repo;
	
	
    public String savePassenger(PassengerModel passenger) {
    	
    	repo.save(passenger);
		return "added passenger with id:" +passenger.getId();
    }
	
    public List<PassengerModel> getAllPassenger(){
    	return repo.findAll();
    }
    
    public Optional<PassengerModel> getPassengerById(String id){
    	
    	return repo.findById(id);
    }
    
    public String deletePassenger(String id) {
    	repo.deleteById(id);
		return "Passenger deleted wwith id:" +id;
    }
    
    public PassengerModel updatePassenger(String id,PassengerModel passenger) {
    	
    	passenger.setId(id);
    	repo.save(passenger);
    	return passenger;
    	
    }
}
