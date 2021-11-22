package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.OrderdEntity;
import com.cadtech.metalprogress.domain.PriceListsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceListsRepository extends JpaRepository<PriceListsEntity,Integer> {
}
