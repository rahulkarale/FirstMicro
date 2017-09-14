package com.example.demo;

import java.util.List;  
import java.util.ArrayList;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
@Service  
public class UserService {  
    @Autowired  
    private UserRepository userRepository;  
    public List<UserRecord> getAllUsers(){  
        List<UserRecord>userRecords = new ArrayList<>();  
        userRepository.findAll().forEach(userRecords::add);
        System.out.println("In userService");
        return userRecords;  
    }  
    public UserRecord getUser(int id){  
        return userRepository.findById(id);  
    }  
    public void addUser(UserRecord userRecord){  
        userRepository.save(userRecord);  
    }  
    public void delete(String id){  
        userRepository.delete(id);  
    }  
}  