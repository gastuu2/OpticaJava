package com.Optica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Optica.model.Trabajo;


@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo, Integer>{
	
	List<Trabajo> findTrabajoByIdcli (int idCli);
//	public Optional<Trabajo> findTrabajoByIdTra(int idTra);
}
