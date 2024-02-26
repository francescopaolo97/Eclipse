package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.StudenteVoti;
import com.example.demo.model.Voti;
import com.example.demo.model.VotiKey;

public interface VotiRepository extends JpaRepository<Voti, VotiKey>{

	@Query(value = "SELECT studente.nome_studente, AVG(risultato) AS media\r\n"
			+ "FROM voti INNER JOIN studente\r\n"
			+ "ON voti.id_studente = studente.id\r\n"
			+ "WHERE voti.id_studente = ?1", nativeQuery = true)
	public List<Object[]> calcolaMedia(@Param("id_studente") long id_studente);


	@Query("SELECT new com.example.demo.model.StudenteVoti(s.nomeStudente, AVG(v.risultato) AS media) "
			+ "FROM Voti v INNER JOIN v.studente s "
			+ "WHERE v.studente.id = ?1 "
			+ "GROUP BY s.nomeStudente")
	List<StudenteVoti> calcolaMediaNew(@Param("id_studente") long id_studente);



}
