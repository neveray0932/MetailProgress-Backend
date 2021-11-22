package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.PriceListsEntity;
import com.cadtech.metalprogress.domain.UserlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserListRepository extends JpaRepository<UserlistEntity,String> {
    UserlistEntity findByUserid(String userid);
}
