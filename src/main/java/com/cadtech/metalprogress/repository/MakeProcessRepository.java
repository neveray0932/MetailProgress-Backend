package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.EmployeeEntity;
import com.cadtech.metalprogress.domain.MakeprocessEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeProcessRepository extends JpaRepository<MakeprocessEntity,String> {
}
