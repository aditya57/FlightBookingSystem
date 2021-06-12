package com.casestudy.api_gateway;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
public class MasterController {
	
	@RequestMapping("/MaterFallBack")
	public Mono<String> masterServiceFallBack(){
		return Mono.just("Master service is taking too time ,try again later");
		
	}
	
	@RequestMapping("/bookingFallBack")
	public Mono<String>bookingServiceFallBack(){
		return Mono.just("booking service is taking time ,please try again later");
		
	}
	
	
	

}
