package com.mgmt.service;

import java.util.List;

import com.mgmt.entity.UserEntity;

public interface UserService {
	
public Integer saveUser(UserEntity ue);

public List<UserEntity> getAllUser();

public UserEntity getUserById(Integer id);

public void deleteUserByID(Integer id);


}
