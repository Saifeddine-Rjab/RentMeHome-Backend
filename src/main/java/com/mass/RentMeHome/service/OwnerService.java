package com.mass.RentMeHome.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mass.RentMeHome.dao.OwnerDao;
import com.mass.RentMeHome.model.Owner;

@Service
public class OwnerService {

	@Autowired
	OwnerDao ownerDao;
	

	public List<Owner> getAllOwners(){
		return ownerDao.findAll();
	}
	
	
	public Owner getOwnerById(String id){
		return ownerDao.findById(id).orElse(null);
	}
	
	
	public Owner addOwner(Owner owner){
		
		//Vérification si le propriétaire existe:
		Owner ownertGot;
		ownertGot=ownerDao.findByEmail(owner.getEmail());
		if(ownertGot==null){
			return ownerDao.save(owner);
		}
		else {
			return null;			
		}
	}
	
	public Owner updateOwner(Owner owner){
		return ownerDao.save(owner);
	}
	

	public Owner deleteOwner(String id){
		
		//Vérification si le propriétaire existe:
		Owner owner;
		owner=ownerDao.findById(id).orElse(null);
		
		if(owner==null) {
			return null;
		}
		else {
			ownerDao.delete(owner);
			return owner;
		}
		
	}
}
