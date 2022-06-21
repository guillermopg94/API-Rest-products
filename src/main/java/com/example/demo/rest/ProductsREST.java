package com.example.demo.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;

@RestController
@RequestMapping("/products")
public class ProductsREST {

	
	@GetMapping
	public ResponseEntity<List<Product>> getProduct(){

		
		
		return ResponseEntity.ok();	
	}


}
