package com.swaggertest.swaggerdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TEmployeeRepo extends JpaRepository<TEmployee,Long>{
    
}
