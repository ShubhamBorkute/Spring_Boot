package com.mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.entity.UserEntity;
import com.mgmt.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public Integer saveUser(UserEntity ue) {
		return repo.save(ue).getUser_id();
	}

	@Override
	public List<UserEntity> getAllUser() {
		return repo.findAll();
	}

	@Override
	public UserEntity getUserById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteUserByID(Integer id) {
		repo.deleteById(id);

	}

}
