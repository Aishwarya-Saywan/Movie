package com.tyss.pm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.pm.entity.Product;
import com.tyss.pm.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;

	public String findProduct(@RequestParam Integer id) {
		Product id2 = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
		return id2.getName();
	}

	public String saveProduct(Product product) {
		Product product2 = productRepository.save(product);
		return product2.getName();
	}

	public String deleteProduct(Integer id) {
		Product id2 = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
		productRepository.delete(id2);
		return id2.getName();

	}

	public Product updateMapping(Integer id, Product product) {
		Product productDB = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
		productRepository.save(productDB);
		return productDB;

	}

}
