package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class UserController {  
	
    @Autowired  
    private UserService userService; 
    
    @RequestMapping("/hello")  
    public String getA(){  
        return "Welcome";  
    }     
    @RequestMapping("/get")  
    public List<UserRecord> getAllUser(){  
    	System.out.println("in controller");
        return userService.getAllUsers();  
    }     
    @RequestMapping(value="/add-user", method=RequestMethod.POST)  
    public void addUser(@RequestBody UserRecord userRecord){  
        userService.addUser(userRecord);  
    }  
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public UserRecord getUser(@PathVariable int id){  
        return userService.getUser(id);  
    }  
    @RequestMapping(value="/user3/{name}", method=RequestMethod.GET)  
    public UserRecord getUserByName(@PathVariable String name){  
        return userService.getUserByName(name);  
    }  
}  