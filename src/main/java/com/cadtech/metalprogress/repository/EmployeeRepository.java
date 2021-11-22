package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.EmployeeEntity;
import com.cadtech.metalprogress.domain.OrderdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {
}
