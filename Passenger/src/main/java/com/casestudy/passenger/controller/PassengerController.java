package com.casestudy.passenger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.passenger.model.PassengerModel;
import com.casestudy.passenger.repository.PassengerRepository;
import com.casestudy.passenger.service.PassengerService;

@RestController
@RequestMapping("/Passenger")
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	
	@PostMapping("/addPassenger")
	public String savePassenger(@RequestBody PassengerModel passenger) {
		
		return passengerService.savePassenger(passenger);
		
	}
	
	@GetMapping("/findAllPassenger")
	public List<PassengerModel> getPassenger(){
		
		return passengerService.getAllPassenger();
	}
	
	@GetMapping("/findAllPassenger/{id}")
	public Optional<PassengerModel> getPassenger(@PathVariable String id){
		return passengerService.getPassengerById(id);
	}

	
	@DeleteMapping("/delete/{id}")
	public String deletePassenger(@PathVariable String id) {
		
		return passengerService.deletePassenger(id);
	}
	
	
	@PutMapping("/update/{id}")
	public PassengerModel updatePassenger(@PathVariable String id, @RequestBody PassengerModel passenger) {
		
		return passengerService.updatePassenger(id,passenger);
	
	}
}
