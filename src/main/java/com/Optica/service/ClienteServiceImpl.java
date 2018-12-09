package com.Optica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Optica.model.Cliente;
import com.Optica.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Optional<Cliente> findClientById(int idClient) {
	
		Optional<Cliente> result= Optional.empty();
		
		try{
			result=clienteRepository.findClienteByIdcli(idClient);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("el error     :   "+e);
		}
		 
		return result;
		
	}

	public void addClient(Cliente client) {
		// TODO Auto-generated method stub
		
	}

	public Optional<Cliente> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public List<Cliente> getLastClients(){
		return clienteRepository.findTop30ByOrderByFechaIngresoDesc();
	}

	public void updateClient(Cliente client) {
		// TODO Auto-generated method stub
		
	}

	public void deleteClient(int clientId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getClienteByNombre(String nombre) {

		return clienteRepository.findByNombreContaining(nombre);
	}

	@Override
	public List<Cliente> getClienteByApellido(String apellido) {
		
		return clienteRepository.findByApellidoContaining(apellido);
	}

	@Override
	public List<Cliente> getClienteByTelefono(String tel) {
		
		return clienteRepository.findByTelefonoOrCelular(tel);
	}


}
