package com.codinglevel.demopracticecode.repository;

import java.util.List;

import com.codinglevel.demopracticecode.entites.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByEmail(String email);
    
}
