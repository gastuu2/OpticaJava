package com.Optica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Optica.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("SELECT u FROM Usuario u where u.usuario = ?1 and u.password= ?2")
	Optional<Usuario> findByUsuarioAndPassword(String usuario, String password);

}
