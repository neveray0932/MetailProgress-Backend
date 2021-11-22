package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.BomEntity;
import com.cadtech.metalprogress.domain.OrderdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderdRepository extends JpaRepository<OrderdEntity,Integer> {
//    List<OrderdEntity> findByoBomid();
}
