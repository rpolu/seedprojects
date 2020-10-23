package com.server.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.app.model.UserProfileModel;
import com.server.app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void saveUser(UserProfileModel userProfileModel) {
		userRepository.save(userProfileModel);
	}

	public UserProfileModel getUser(String userId) {
		return userRepository.findById(userId).get();
	}

	public List<UserProfileModel> getUserList() {
		return userRepository.findAll();
	}

}
