package com.example.automappingdto.dao;

import com.example.automappingdto.entity.Address;
import com.example.automappingdto.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}
