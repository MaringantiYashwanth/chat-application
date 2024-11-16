package com.yash.websocket.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
@Data
public class User {
	@Id
	private String nickName;
	private String fullName;
	private Status status;
}
