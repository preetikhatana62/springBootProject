package com.userService;

import java.util.List;

import com.model.Users;

public interface userService {
	public Users saveUsers(Users users);
	public List<Users> getUsers();
	public Users getId(  int uid);
	public Users  update( int uid);
	public void  delete (int uid);
	
	
}
