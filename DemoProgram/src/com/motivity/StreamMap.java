package com.motivity;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<User> ob=new ArrayList<User>();
        ob.add(new User(1,"Ramya","secrete","ramya@gmail.com"));
        ob.add(new User(2,"Venu","secrete","venu@gmail.com"));
        ob.add(new User(3,"Nikhil","secrete","nikhil@gmail.com"));
        ob.add(new User(4,"Josna","secrete","josna@gmail.com"));
        ob.add(new User(5,"Satya","secrete","satya@gmail.com"));
        List<UserDTO> userDTOS=new ArrayList<UserDTO>();

      for(User user : ob)
      {
          userDTOS.add(new UserDTO(user.getId(),user.getUserName(),user.getEmail()));

      }
      for(UserDTO dto:userDTOS)
      {
          System.out.println(dto);
      }

    }
}
class UserDTO
{
	private int id;
    private String userName;
    private String email;
    
    
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
}
class User
{
    private int id;
    private String userName;
    private String password;
    private String email;
    
    
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
	
    
}
