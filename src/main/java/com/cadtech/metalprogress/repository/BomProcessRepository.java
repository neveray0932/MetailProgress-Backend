package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.BomProcessEntity;
import com.cadtech.metalprogress.domain.OrderdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BomProcessRepository extends JpaRepository<BomProcessEntity,Integer> {
}
