package com.deloitte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.entity.Employee;

@Repository

public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {
	
	List<Employee> findByUid(Integer uid);

}
