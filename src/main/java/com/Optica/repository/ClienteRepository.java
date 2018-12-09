package com.Optica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Optica.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

//	@Query("SELECT TOP 30 c FROM clientes c ORDER BY c.fecha_ingreso DESC")
	public List<Cliente> findTop30ByOrderByFechaIngresoDesc();
	
	public List<Cliente> findByNombreContaining(String nombre);
	
	public List<Cliente> findByApellidoContaining(String apellido);
	
	@Query("Select c from Cliente c where telefono LIKE %?1% or celular LIKE %?1%")
	public List<Cliente> findByTelefonoOrCelular(String telefono);
	
	
	@Query("SELECT c from Cliente c where idcli= ?1")
	public Optional<Cliente> findClienteByIdcli(int idCli);
}
