package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Employee;

//JpaRepository - internally provides @Respository annotation, so we don't need to add Repository again)
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
