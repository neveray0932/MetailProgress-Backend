package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.ProdKindEntity;
import com.cadtech.metalprogress.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
}
