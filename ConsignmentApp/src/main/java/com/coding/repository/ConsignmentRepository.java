package com.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.entity.Consignment;

@Repository
public interface ConsignmentRepository extends JpaRepository<Consignment, Integer> 
{

}
