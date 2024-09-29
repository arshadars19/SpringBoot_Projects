package com.project.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecom.modals.product;
import com.project.ecom.services.productService;

@RestController
public class productController {

	@Autowired
	private productService prodService;

//	@GetMapping("/products")
//	public List<Map<String, Object>> getAllProducts() {
//		return Arrays.asList(Map.of("Name", "Product 1", "Price", 250), Map.of("Name", "Product 2", "Price", 150));
//	}

	@GetMapping("/products")
	public List<product> getAllProducts() {
		return prodService.getAllProducts();
	}

}
