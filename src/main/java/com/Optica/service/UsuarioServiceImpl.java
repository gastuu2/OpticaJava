package com.Optica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Optica.model.Usuario;
import com.Optica.repository.UsuarioRepository;


@Service("usuariosService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository userRepository;
	

	public Optional<Usuario> findUserById(int idUser) {
		// TODO Auto-generated method stub
		return userRepository.findById(idUser);
	}
	
	public Optional<Usuario> findByUsuarioAndPassword(String user, String password) {
		System.out.println("servicio : "+ user + " "  + password);
		return userRepository.findByUsuarioAndPassword(user, password);
	}


	public List<Usuario> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public void updateUser(Usuario user) {
		
		userRepository.save(user);
		
	}

	public void deleteUser(int userId) {
		
		userRepository.deleteById(userId);
		
	}

}
