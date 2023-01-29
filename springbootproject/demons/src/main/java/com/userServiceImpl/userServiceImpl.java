package com.userServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.UserRepository;
import com.model.Users;
import com.userService.userService;
@Service
public class userServiceImpl implements userService{
	@Autowired
	UserRepository repo;
	List<Users>list;
	 
	@Override
	public List<Users> getUsers() {
		   
		return  repo.findAll();
	
	}

	@Override
	public Users getId( int uid) {
		
	    return repo.getOne( uid); 
	}

	@Override
	public Users update(int  uid) {
		
	   return repo.findById(uid).get();
	   
	   
	}

	@Override
	public void delete(int uid) {
		 Users s = repo.getById(uid);
		 repo.delete(s);
		
		
	}

	@Override
	public Users saveUsers(Users users) {
		 
		return repo.save(users);
	}

	
	
	

	 
		
		  
	
	
	
}
