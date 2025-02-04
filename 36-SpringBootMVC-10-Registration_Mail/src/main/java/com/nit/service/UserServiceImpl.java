package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.UserEntity;
import com.nit.repository.UserRespository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRepo;
	
	@Override
	public Integer saveUser(UserEntity u) {
		return userRepo.save(u).getUId();
	}

}
