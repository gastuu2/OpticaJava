package com.Optica.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Optica.Dto.ClienteTrabajosDto;
import com.Optica.model.Cliente;
import com.Optica.model.Trabajo;
import com.Optica.service.ClienteService;
import com.Optica.service.TrabajoService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

@Autowired
ClienteService clienteService;

@Autowired
TrabajoService trabajoService;
	
	
	@GetMapping(value="/getClientes")
    public List<Cliente> getClientes() {
		List<Cliente> losclient= clienteService.getLastClients();
		return losclient;
	}
	
	
	@GetMapping(value="/getCliente")
	public ClienteTrabajosDto getCliente(String  idCli){
		
		System.out.println("eeeee  " +idCli);
		Optional<Cliente> clienteResult =clienteService.findClientById(Integer.parseInt(idCli));
		List<Trabajo> trabajos= trabajoService.getWorksByIdCli((Integer.parseInt(idCli)));
		ClienteTrabajosDto dto= new ClienteTrabajosDto(clienteResult.get(),trabajos);
		return dto;
	}
	
	@GetMapping(value="/getClienteByFiltro")
	public List<Cliente> getClienteByFiltro(String filtro, String value){
		List<Cliente> resultadoBusqueda= new ArrayList();
		switch (filtro){
		case "Nombre": 
			resultadoBusqueda= clienteService.getClienteByNombre(value);
			break;
		case "Apellido":
			resultadoBusqueda= clienteService.getClienteByApellido(value);
			break;
		case "Telefono":
			resultadoBusqueda= clienteService.getClienteByTelefono(value);
			break;
		}
		
	
		return resultadoBusqueda;
	}
	
	
	
}
