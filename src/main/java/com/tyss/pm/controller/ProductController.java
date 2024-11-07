package com.tyss.pm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.pm.entity.Product;
import com.tyss.pm.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "api/v1")
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService;
	
	@GetMapping
	public String findProduct(@RequestParam Integer id) {
		String productName = productService.findProduct(id);
		return productName;
	}
	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		String saveProduct = productService.saveProduct(product);
		return saveProduct;
	}
	
	
	@DeleteMapping
	public String deleteProduct(@RequestParam Integer id) {
		String deleteProduct = productService.deleteProduct(id);
		return deleteProduct;
	}
	@PutMapping
	public Product updateProduct(@RequestParam("id") Integer id, @RequestBody Product product){
		Product updateProduct = productService.updateMapping(id, product);
		
		return updateProduct;
		
	}

}
