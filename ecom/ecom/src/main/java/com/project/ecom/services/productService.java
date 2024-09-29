package com.project.ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ecom.modals.product;
import com.project.ecom.repositories.productRepository;

@Service
public class productService {

	@Autowired
	private productRepository productRepo;

	public List<product> getAllProducts() {
		return productRepo.findAll();
	}
}
