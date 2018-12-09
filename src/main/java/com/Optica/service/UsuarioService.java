package com.Optica.service;

import java.util.List;
import java.util.Optional;

import com.Optica.model.Usuario;


public interface UsuarioService {
	Optional<Usuario> findUserById(int idUser);
	List<Usuario> getAllUsers();
	Optional<Usuario> findByUsuarioAndPassword(String user, String password);
	void updateUser(Usuario user);
	void deleteUser(int userId);
//	List<Horario> buscarPorIdPelicula(int idPelicula, Date fecha);
//	void insertar(Horario horario);
//	List<Horario> buscarTodos();
//	Page<Horario> buscarTodos(Pageable page);
//	void eliminar(int idHorario);
//	Horario buscarPorId(int idHorario);

}
