
package com.Optica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL	 
	private int id_usuario;
	private String usuario;
	private String password;
  
	
	
	  public Usuario() {
		
	  }
	  public Usuario(String usuario, String password)
	  {
	    this.usuario = usuario;
	    this.password = password;
	  }
	  
	  public String getUsuario()
	  {
	    return this.usuario;
	  }
	  
	  public void setUsuario(String usuario)
	  {
	    this.usuario = usuario;
	  }
	  
	  public String getPassword()
	  {
	    return this.password;
	  }
	  
	  public void setPassword(String password)
	  {
	    this.password = password;
	  }
}
