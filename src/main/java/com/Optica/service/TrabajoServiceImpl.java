package com.Optica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Optica.model.Trabajo;
import com.Optica.repository.TrabajoRepository;


@Service
public class TrabajoServiceImpl implements TrabajoService{
	
	@Autowired
	TrabajoRepository workRepository;
	
	public Optional<Trabajo> findWorkById(int idWork) {
		// TODO Auto-generated method stub
		return workRepository.findById(idWork);
	}


	public List<Trabajo> getAllWorks() {
		// TODO Auto-generated method stub
		return workRepository.findAll();
	}

	public void updateWork(Trabajo work) {
		workRepository.save(work);
	}

	public void deleteWork(int workId) {
		workRepository.deleteById(workId);
		
	}


	public List<Trabajo> getWorksByIdCli(int idcli) {
		
		return workRepository.findTrabajoByIdcli(idcli);
	}




}
