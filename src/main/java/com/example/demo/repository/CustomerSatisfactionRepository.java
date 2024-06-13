package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerSatisfaction;

@Repository
public interface CustomerSatisfactionRepository extends JpaRepository<CustomerSatisfaction, Integer> {

}
