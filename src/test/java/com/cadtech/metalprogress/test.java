package com.cadtech.metalprogress;

import com.cadtech.metalprogress.domain.OrderdEntity;
import com.cadtech.metalprogress.repository.OrderdRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class test {
    @Autowired
    private OrderdRepository orderdRepository;

    @Test
    public void method1(){
         Optional<OrderdEntity> result = orderdRepository.findById(99353);
         System.out.print(result);

    }
}
