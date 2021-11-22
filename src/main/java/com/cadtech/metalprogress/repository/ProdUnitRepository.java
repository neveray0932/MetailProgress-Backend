package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.ProdUnitEntity;
import com.cadtech.metalprogress.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdUnitRepository extends JpaRepository<ProdUnitEntity,Integer> {
}
