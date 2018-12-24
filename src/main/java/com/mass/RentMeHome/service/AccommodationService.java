package com.mass.RentMeHome.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mass.RentMeHome.dao.AccommodationDao;
import com.mass.RentMeHome.model.Accommodation;

@Service
public class AccommodationService {

	@Autowired
	AccommodationDao accommodationDao;
	
	public List<Accommodation> getAllAccommodations(){
		return accommodationDao.findAll();
	}
	
	
	public Accommodation getAccommodationById(String id){
		return accommodationDao.findById(id).orElse(null);
	}
	
	
	
	public Accommodation addAccommodation(Accommodation accommodation){
		
		return accommodationDao.save(accommodation);		
	}
	
	public Accommodation updateAccommodation(Accommodation accommodation){
		return accommodationDao.save(accommodation);
	}
	

	public Accommodation deleteAccommodation(String id){
		
		//Vérification si l'hébergement existe:
		Accommodation accommodation;
		accommodation=accommodationDao.findById(id).orElse(null);
		
		if(accommodation==null) {
			return null;
		}
		else {
			accommodationDao.delete(accommodation);
			return accommodation;
		}
		
	}
}
