package com.Optica.service;
import java.util.List;
import java.util.Optional;

import com.Optica.model.Trabajo;


public interface TrabajoService {

	Optional<Trabajo> findWorkById(int idWork);
	List<Trabajo> getAllWorks();
	void updateWork(Trabajo work);
	void deleteWork(int workId);
	List<Trabajo> getWorksByIdCli(int idcli);
}
