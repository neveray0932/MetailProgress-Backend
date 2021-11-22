package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.BomEntity;
import com.cadtech.metalprogress.domain.OrdermEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdermRepository extends JpaRepository<OrdermEntity,String> {
}
