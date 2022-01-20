package com.vinay.location.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.vinay.location.entity.LocationEntity;
import com.vinay.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired LocationService service;
	 
	 @PostMapping("/saveloc") 
	 public String create(@ModelAttribute("locationEntity") LocationEntity locationEntity,ModelMap modelMap)
	 { 
		 LocationEntity entity = service.saveLocation(locationEntity);
		 
		 String msg = "added user successfully"+entity.getId();
		 
		 modelMap.addAttribute("msg ",msg);
		 
		 return "CreateLocation" + "!";
	 }
	 

	@RequestMapping("/showCreate")
	public String showCreatePage() {
		Logger logger = LoggerFactory.getLogger(LocationController.class);
		logger.info("rendering home page");
		return "CreateLocation";
	}

	@RequestMapping("/displaylocations")
	public String diplayAllLocations(ModelMap map)
	{
		map.addAttribute("locations",service.getall());
		return "displaylocations";
	}
}
