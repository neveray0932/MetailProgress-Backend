package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.BomEntity;
import com.cadtech.metalprogress.domain.MakeOrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MakeOrderDetailRepository extends JpaRepository<MakeOrderDetailEntity,Integer> {
  List<MakeOrderDetailEntity> findBymBomid(Integer mBomid);
}
