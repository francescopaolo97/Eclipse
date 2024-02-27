package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrdineProdotto;
import com.example.demo.model.UniqueKey;

@Repository
public interface OrdineProdottoRepository extends JpaRepository<OrdineProdotto, UniqueKey>{

}
