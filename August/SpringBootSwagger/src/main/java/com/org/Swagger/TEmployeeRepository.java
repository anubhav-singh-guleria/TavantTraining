package com.org.Swagger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TEmployeeRepository extends JpaRepository<TEmployee, Long> {

}
