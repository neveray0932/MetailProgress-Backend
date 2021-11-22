package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.EmployeeEntity;
import com.cadtech.metalprogress.domain.MachineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<MachineEntity,String> {
}
