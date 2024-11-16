package com.yash.websocket.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository repository;
	
	public void saveUser(User user) {
		user.setStatus(Status.ONLINE);
		repository.save(user);
	}
	
	public void disconnect(User user) {
		
	}
	
	public List<User> findConnectedUsers() {
		
	}
}
