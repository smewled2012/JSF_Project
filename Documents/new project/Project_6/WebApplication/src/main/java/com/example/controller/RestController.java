package com.example.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.UserService;
import com.example.model.User;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/hello")
	public String Hello() {
		
		return "Hello SPring Boot ";
	}
	
/* to get the list of all users  */
	
/* get the list of all users */
	
	@GetMapping("/users")
	public Iterable<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam String password ) {
		
		User user = new User(firstname, lastname, email, password);
		userService.saveMyUser(user);
		return "User is saved ";
	}
	
	/*to save a user   we use a HTTP verb of Post with a body */
	
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		
		return userService.save(user);
		
	}
	
	/* find a user by id 
	//@GetMapping("/users/{id}")
	//public Optional<User> findOneById(int userid) {
		return userService.findOne(userid);
	}
	
	*/
	
	/* find a user by id */ 
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value="id") Integer userid){
		Optional<User> user =userService.findOne(userid);
		
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}
	
	/* delete a user searching by id */
	/*@DeleteMapping("/users/{id}")
	public ResponseEntity< User> deletUser(@PathVariable(value="id") int userid) {
		Optional<User> user = userService.findOne(userid);
		if(user==null) {
			ResponseEntity.notFound().build();
		}
		userService.deleteUser(user);
		return ResponseEntity.ok().build();
	}*/
	
/* Delete a User */
	
	
	
	
	
	

}
