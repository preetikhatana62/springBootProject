package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Users;
import com.userService.userService;
@RestController
public class constroller {
	@Autowired
	 private  userService userserv;
	@PostMapping("/get")
	public Users getUs(  @RequestBody Users u) {
		return this.userserv.saveUsers(u);
	}
	@GetMapping("/user")
	public List<Users> get() {
		return  this.userserv.getUsers();
	}
	
	@GetMapping( "/users/{uid}")
	public  Users  get( @PathVariable int uid)
	{
		return this.userserv.getId(uid);
	}
	@PutMapping("/update/{uid}") 
   public  Users update( @PathVariable int uid)
   {
	   return this.userserv.update(uid);
   }
	@DeleteMapping("/remove{uid}")
	public void delete( @PathVariable int uid)
	{
		 this.userserv.delete(uid);
	}   
}
