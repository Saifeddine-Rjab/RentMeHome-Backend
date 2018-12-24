package com.mass.RentMeHome.controller;


import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mass.RentMeHome.service.ImageService;

@RestController
@RequestMapping ("/api/images")
public class ImageController {
	
	@Autowired 
	ImageService imageService;
	
	@RequestMapping(value = "/{id}",
			  method=RequestMethod.GET, 
			  produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getImage(@PathVariable String id) throws IOException {
        return imageService.getImage(id);
    }
	
	@RequestMapping(value="", 
			method=RequestMethod.POST, 
			consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		return imageService.uploadFile(file);
	}
	
	
}
