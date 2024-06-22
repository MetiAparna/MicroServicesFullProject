package com.Aparna.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aparna.employeeapp.entity.EmployeeEntity;

@Repository
public interface Employeerepository extends JpaRepository<EmployeeEntity, Long> {



}
