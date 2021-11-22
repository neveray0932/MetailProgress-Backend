package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.PriceListsEntity;
import com.cadtech.metalprogress.domain.ProdKindEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdKindRepository extends JpaRepository<ProdKindEntity,Integer> {
}
