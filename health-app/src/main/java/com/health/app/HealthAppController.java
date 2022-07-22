package com.health.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HealthAppController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HttpServletRequest request;
	
	
	@GetMapping(value = "/")
	public String health() {
		System.out.println(request.getRequestURL() + "actuator/health");
		return restTemplate.getForObject(
						request.getRequestURL() + "actuator/health", 
						String.class);
	}
}
