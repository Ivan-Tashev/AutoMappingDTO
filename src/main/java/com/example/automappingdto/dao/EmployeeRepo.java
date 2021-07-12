package com.example.automappingdto.dao;

import com.example.automappingdto.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.subordinates IS NOT EMPTY")
    List<Employee> getManagers();

    List<Employee> findByBirthdayBeforeOrderBySalaryDesc(LocalDate birthday);

}
