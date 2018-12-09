package com.Optica.Dto;

import java.util.List;

import com.Optica.model.Cliente;
import com.Optica.model.Trabajo;

public class ClienteTrabajosDto {

	private Cliente cliente;
	private List<Trabajo> trabajos;
	
	public ClienteTrabajosDto() {
		
	}
	
	public ClienteTrabajosDto(Cliente cliente, List<Trabajo> trabajos) {
		this.cliente= cliente;
		this.trabajos= trabajos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Trabajo> getTrabajos() {
		return trabajos;
	}
	public void setTrabajos(List<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}
	
	
}
