package com.mass.RentMeHome.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mass.RentMeHome.model.Format;
import com.mass.RentMeHome.service.FormatService;

@RestController
@RequestMapping ("/api/format")
public class FormatController {

	@Autowired
	FormatService formatService;
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<Format> getFormats() {
		return formatService.getAllFormats();				
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Format getAccommodation(@PathVariable String id) {
		return formatService.getFormatById(id);			
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public Format  addAccommodation(@RequestBody  Format format) {	
		return formatService.addFormat(format);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "")
	public Format  updateFormat(@RequestBody  Format format) {	
		return formatService.updateFormat(format);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public Format  deleteFormat(@PathVariable String id) {	
		return formatService.deleteFormat(id);
	}
	
}
