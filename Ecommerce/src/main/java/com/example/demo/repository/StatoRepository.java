package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Stato;

@Repository
public interface StatoRepository extends JpaRepository<Stato, Long>{

}
