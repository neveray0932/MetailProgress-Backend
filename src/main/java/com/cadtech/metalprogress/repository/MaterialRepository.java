package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.EmployeeEntity;
import com.cadtech.metalprogress.domain.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity,String> {
}
