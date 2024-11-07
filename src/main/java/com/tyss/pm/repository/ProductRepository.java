package com.tyss.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.pm.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
