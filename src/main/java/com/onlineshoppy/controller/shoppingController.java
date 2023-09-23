

package com.onlineshoppy.controller;
import com.onlineshoppy.service.*;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshoppy.model.laptop;

@RestController
public class shoppingController {
	
	shoppingService service=new shoppingService();
	@RequestMapping(method=RequestMethod.GET,value="/laptops")
	public List<laptop> getAlllaptops() {
		return service.getAllLaptops();	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops/{id}")
	public String getLaptop() {
		return "Will display specified laptop"; 
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/laptops")
	public String addLaptop() {
		return "One Laptop Added";
	}

	@RequestMapping(method=RequestMethod.PUT,value="/laptops/{id}")
	public String updateLaptop() {
		return "One laptop Added";
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/laptops/{id}")
	public String deleteLaptop() {
		return "One Laptop Deleted";
	}
}
