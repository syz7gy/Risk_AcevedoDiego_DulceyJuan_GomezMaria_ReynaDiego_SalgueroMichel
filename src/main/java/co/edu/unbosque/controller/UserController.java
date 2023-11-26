package co.edu.unbosque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.model.User;
import co.edu.unbosque.services.UserService;
import co.edu.unbosque.util.MyLinkedList;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = { "http://lovalhost:8080", "http://localhost:8081", "*" })
@Transactional
public class UserController {

	@Autowired
	private UserService userServ;

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping(path = "/createuserwithjson", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createNewUserWithJson(@RequestBody User newUser) {
		int status = userServ.create(newUser);

		if (status == 0) {
			return new ResponseEntity<String>("User created succesfully.", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Error creating the user. The username might be already taken.",
					HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@GetMapping(path = "/getall")
	public ResponseEntity<MyLinkedList<User>> getAll() {
		MyLinkedList<User> listOfUsers = userServ.getAll();

		if (listOfUsers.isEmpty()) {
			return new ResponseEntity<MyLinkedList<User>>(listOfUsers, HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<MyLinkedList<User>>(listOfUsers, HttpStatus.ACCEPTED);
		}

	}

}
