package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Account")
public class Account implements Serializable{

	@Id
	private String uID;
	@Indexed
	private String u_Name;
	private String password;
	private String u_Phone;
	private String u_Address;
	private String u_Zipcode;
	private String u_balance;
	
}
