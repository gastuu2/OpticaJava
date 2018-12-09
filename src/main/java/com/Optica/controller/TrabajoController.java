package com.Optica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Optica.model.Trabajo;
import com.Optica.service.TrabajoService;

@RestController
@RequestMapping("/trabajos")
public class TrabajoController {
	
@Autowired
TrabajoService trabajosService;


@GetMapping(value="/getTrabajos")
public List<Trabajo> getTrabajos(int idCli) {
	return trabajosService.getWorksByIdCli(idCli);
}

@GetMapping(value="/getTrabajo")
public Trabajo getTrabajo(int idTra) {
	Optional<Trabajo> trabajo= trabajosService.findWorkById(idTra);
	return trabajo.get();
}
	

}
