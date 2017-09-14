package com.example.demo;



import org.springframework.data.repository.CrudRepository;  
public interface UserRepository extends CrudRepository<UserRecord, String> {  
	public UserRecord findById(int id);
}  
