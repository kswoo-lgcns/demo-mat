package com.example.demo.mat.mass.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.mat.mass.entity.UserEntity;

@Service
public class MassService {

	private ThreadLocal<List<UserEntity>> threadLocal = new ThreadLocal<>();
	
	public void createMassData() {
		List<UserEntity> userList = threadLocal.get();
		if(userList == null) {
			userList = new ArrayList<>();
			threadLocal.set(userList);
		}
		String id;
		for(int count=0;count<10000000;count++) {
			UserEntity user = new UserEntity();
			userList.add(user);
			id = "LGCNS-" + UUID.randomUUID().toString();
			user.setId(id);
			user.setName(id);
			user.setAddr(id);
		}
	}
}
