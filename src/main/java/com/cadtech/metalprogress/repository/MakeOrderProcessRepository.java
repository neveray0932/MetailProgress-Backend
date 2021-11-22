package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.BomEntity;
import com.cadtech.metalprogress.domain.MakeOrderProcessEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeOrderProcessRepository extends JpaRepository<MakeOrderProcessEntity,Integer> {
}
