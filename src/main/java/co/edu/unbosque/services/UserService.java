package co.edu.unbosque.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.model.User;
import co.edu.unbosque.repository.UserRepository;
import co.edu.unbosque.util.AESutil;
import co.edu.unbosque.util.MyLinkedList;

@Service
public class UserService implements CRUDOperations<User> {

	@Autowired
	private UserRepository userRepo;

	public UserService() {
	}

	@Override
	public int create(User data) {

		if (findUsernameAlreadyTaken(data)) {
			return 1;
		} else {
			data.setUsername(AESutil.encrypt(data.getUsername()));

			data.setPassword(AESutil.encrypt(data.getPassword()));

			userRepo.save(data);
			return 0;

		}
	}

	@Override
	public MyLinkedList<User> getAll() {
		MyLinkedList<User> aux = new MyLinkedList<User>();
		userRepo.findAll().forEach(u -> aux.add(u));
		for(int i = 0; i<aux.size(); i++) {
			aux.get(i).getInfo().setUsername(AESutil.decrypt(aux.get(i).getInfo().getUsername()));
			aux.get(i).getInfo().setPassword(AESutil.decrypt(aux.get(i).getInfo().getPassword()));
			aux.get(i).getInfo().setAge(AESutil.decrypt(aux.get(i).getInfo().getAge()));
			aux.get(i).getInfo().setTroopColor(AESutil.decrypt(aux.get(i).getInfo().getTroopColor()));
			aux.get(i).getInfo().setCountry(AESutil.decrypt(aux.get(i).getInfo().getCountry()));
		}
		return aux;
	}

	@Override
	public int deleteById(Long id) {
		Optional<User> found = userRepo.findById(id);

		if (found.isPresent()) {
			userRepo.delete(found.get());
			return 0;
		} else {
			return 1;
		}

	}

	@Override
	public int updateById(Long id, User newData) {

		Optional<User> found = userRepo.findById(id);
		Optional<User> newFound = userRepo.findByUsername(AESutil.encrypt(newData.getUsername()));

		if (found.isPresent() && !newFound.isPresent()) {

			User temp = found.get();
			temp.setUsername(AESutil.encrypt(newData.getUsername()));
			temp.setPassword(AESutil.encrypt(newData.getPassword()));
			userRepo.save(temp);
			return 0;
		} else if (found.isPresent() && newFound.isPresent()) {
			return 1;
		} else if (!found.isPresent()) {
			return 2;
		} else {
			return 3;
		}

	}

	@Override
	public long count() {
		return userRepo.count();
	}

	@Override
	public boolean exists(Long id) {
		return userRepo.existsById(id) ? true : false;
	}

	public boolean findUsernameAlreadyTaken(User newUser) {

		Optional<User> found = userRepo.findByUsername(AESutil.encrypt(newUser.getUsername()));

		return found.isPresent() ? true : false;
	}

}
