package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;

@SpringBootApplication
@RestController
@RequestMapping("/Item")
public class RedisApplication implements CommandLineRunner{

	@Autowired
	ItemRepository ir;
	
//	@PostMapping
//	public Item save(@RequestBody Item item)
//	{
//		return ir.save(item);
//	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}
	
	



	@Override
	public void run(String... args) throws Exception {
		System.out.println("Saving");
		Item i = new Item();
		i.setItemId("id1");
		i.setItemName("Chair");
		i.setItemPrice(20.0);
		i.setItemQty(2);
		ir.save(i);
		System.out.println("Saved");
	}
}
