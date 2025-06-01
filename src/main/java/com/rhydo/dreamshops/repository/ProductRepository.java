package com.rhydo.dreamshops.repository;

import com.rhydo.dreamshops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
