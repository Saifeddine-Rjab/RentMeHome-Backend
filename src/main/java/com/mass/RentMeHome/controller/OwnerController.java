package com.mass.RentMeHome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mass.RentMeHome.model.Owner;
import com.mass.RentMeHome.service.OwnerService;

@RestController
@RequestMapping ("/api/owners")
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<Owner> Owners() {
		return ownerService.getAllOwners();				
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Owner getOwner(@PathVariable String id) {
		return ownerService.getOwnerById(id);			
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public Owner addOwner(@RequestBody  Owner owner) {	
		return ownerService.addOwner(owner);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "")
	public Owner updateOwner(@RequestBody  Owner owner) {	
		return ownerService.updateOwner(owner);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public Owner deleteOwner(@PathVariable String id) {	
		return ownerService.deleteOwner(id);
	}

}
