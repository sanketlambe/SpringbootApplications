package com.example.demo.Repository;

import com.example.demo.entity.composteKey.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, AccountPK> {
}
