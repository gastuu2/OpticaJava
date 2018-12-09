package com.Optica.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Optica.model.Usuario;
import com.Optica.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UserController {
	
@Autowired
@Qualifier("usuariosService")
UsuarioService userService;

	
	@GetMapping("/getUser")
	public Boolean getUser(String user, String password) {
		System.out.println("usuario : "+ user +" password:  " + password);
		Optional<Usuario> listUser=userService.findByUsuarioAndPassword(user, password);
		System.out.println(listUser);
		if (listUser.isPresent()){
			Usuario userfound= listUser.get();
			System.out.println("el usuario :" + userfound);
			return true;
		}else {
			return false;
		}
		
		
	}
	
}
