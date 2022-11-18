package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountDao;

@RestController
public class ThymeController {

	@Autowired
	private AccountDao dao;
	
	@GetMapping("/all")
	public String getAllacc(Model model)
	{
		List<Account> list = dao.findALl();
		model.addAttribute("accounts", list);
		return "account";
	}
}
