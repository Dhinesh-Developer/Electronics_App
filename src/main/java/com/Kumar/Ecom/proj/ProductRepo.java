package com.Kumar.Ecom.proj;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

//	List<Product> searchProducts(String keyword);


}
