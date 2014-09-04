package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.User;

@Service
public class UserService {
	
	@Transactional(readOnly = true)
	public User getUserById(Integer id){
		return User.findById(id);
	}
}
