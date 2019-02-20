package com.mass.RentMeHome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mass.RentMeHome.dao.FormatDao;
import com.mass.RentMeHome.model.Format;

@Service
public class FormatService {

	@Autowired
	FormatDao formatDao;
	
	public List<Format> getAllFormats(){
		return formatDao.findAll();
	}
	
	
	public Format getFormatById(String id){
		return formatDao.findById(id).orElse(null);
	}
	
	
	
	public Format addFormat(Format format){
		return formatDao.save(format);		
	}
	
	public Format updateFormat(Format format){
		return formatDao.save(format);
	}
	

	public Format deleteFormat(String id){
		
		//Vérification si le format existe:
		Format format;
		format=formatDao.findById(id).orElse(null);
		
		if(format==null) {
			return null;
		}
		else {
			formatDao.delete(format);
			return format;
		}
		
	}
}
