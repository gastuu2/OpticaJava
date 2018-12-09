package com.Optica.service;

import java.util.List;
import java.util.Optional;

import com.Optica.model.Cliente;


public interface ClienteService {

	Optional<Cliente> findClientById(int idClient);
	Optional<Cliente> getAllClients();
	List<Cliente> getLastClients();
	List<Cliente> getClienteByNombre(String nombre);
	List<Cliente> getClienteByApellido(String apellido);
	List<Cliente> getClienteByTelefono(String tel);
	
	void updateClient(Cliente client);
	void deleteClient(int clientId);
}
