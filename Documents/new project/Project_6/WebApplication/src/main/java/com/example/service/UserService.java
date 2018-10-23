package com.example.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.example.repository.UserRepository;

import com.example.model.*;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	// create a method which saves the data's into our database 
	public void saveMyUser(User user) {
		
		//implement this save method 
		userRepository.save(user);
	}

/* saving a user */ 
	
	public User save(User user) {
		
		return userRepository.save(user);
	}
	
	
/* to get the list of all users  */
	
	public Iterable<User> findAll(){
		
		return  userRepository.findAll();	
	}
	
	/* to get a specific user */
	
/* to get a user by id */
	
	public Optional<User> findOne(int userid) {
		return userRepository.findById(userid);
		}
	
	/* deleting a specific user by id */

	public void delete(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
		
	}

	

}
