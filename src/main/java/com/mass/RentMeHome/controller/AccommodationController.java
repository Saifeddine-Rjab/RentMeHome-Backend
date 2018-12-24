package com.mass.RentMeHome.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mass.RentMeHome.model.Accommodation;
import com.mass.RentMeHome.service.AccommodationService;

@RestController
@RequestMapping ("/api/accommodation")
public class AccommodationController {
	
	@Autowired
	AccommodationService accommodationService;
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<Accommodation> getAllAccommodations() {
		return accommodationService.getAllAccommodations();				
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Accommodation getAccommodation(@PathVariable String id) {
		return accommodationService.getAccommodationById(id);			
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public Accommodation  addAccommodation(@RequestBody  Accommodation accommodation) {	
		return accommodationService.addAccommodation(accommodation);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "")
	public Accommodation  updateAccommodation(@RequestBody  Accommodation accommodation) {	
		return accommodationService.updateAccommodation(accommodation);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public Accommodation  deleteAccommodation(@PathVariable String id) {	
		return accommodationService.deleteAccommodation(id);
	}
}
