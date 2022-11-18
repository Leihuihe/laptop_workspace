package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductDao;

@RestController
@RequestMapping("/product")
public class Controller {

	    private static final String PATH = "/error";

	    @RequestMapping(value = PATH)
	    public String error() {
	        return "Error handling";
	    }

		
		@Autowired
		private ProductDao dao;
		
		@PostMapping("/save")
		public Product save(@RequestBody Product product)
		{
			return dao.save(product);
		}
		
		@GetMapping
		public List<Product> getAllProducts()
		{
			return dao.findALl();
		}
		
		@GetMapping("/{id}")
		public Product findProduct(@PathVariable int id)
		{
			return dao.findProductById(id);
		}
		
		@DeleteMapping("/{id}")
		public String deleteProduct(@PathVariable int id)
		{
			return dao.deleteProduct(id);
		}
}
