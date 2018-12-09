
package com.Optica.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL 
  private int    idcli;
  private String nombre;
  private String apellido;
  private String telefono;
  private String celular;
  private String domicilio;
  private String localidad;
  private String email;
  private String obrasocial;
  private String nombreobrasocial;
  private String comentarios;
  @Column(name = "fecha_ingreso", nullable = true)
  private Date fechaIngreso;
//  @Column(name = "fecha_nac" , nullable = true)
//  private Date fecha_nac;
//  @OneToMany(mappedBy="cliente", cascade= CascadeType.ALL, fetch=FetchType.LAZY)
//  private List<Trabajo> trabajos;

  
  

public Cliente() {
	
}


@Override
public String toString() {
	return "Cliente [idcli=" + idcli + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
			+ ", celular=" + celular + ", domicilio=" + domicilio + ", localidad=" + localidad + ", email=" + email
			+ ", obrasocial=" + obrasocial + ", nombreobrasocial=" + nombreobrasocial 
			+", comentarios=" + comentarios + ", fechaIngreso="
			+ fechaIngreso  + "]";
}

public int getIdcli() {
	return idcli;
}


public void setIdcli(int idcli) {
	this.idcli = idcli;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getDomicilio() {
	return domicilio;
}

public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}

public String getLocalidad() {
	return localidad;
}

public void setLocalidad(String localidad) {
	this.localidad = localidad;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getObrasocial() {
	return obrasocial;
}

public void setObrasocial(String obrasocial) {
	this.obrasocial = obrasocial;
}

public String getNombreobrasocial() {
	return nombreobrasocial;
}

public void setNombreobrasocial(String nombreobrasocial) {
	this.nombreobrasocial = nombreobrasocial;
}

public String getComentarios() {
	return comentarios;
}

public void setComentarios(String comentarios) {
	this.comentarios = comentarios;
}

public Date getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(Date fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}

//public Date getFecha_nac() {
//	return fecha_nac;
//}
//
//public void setFecha_nac(Date fecha_nac) {
//	this.fecha_nac = fecha_nac;
//}


//public List<Trabajo> getTrabajos() {
//	return trabajos;
//}
//
//
//public void setTrabajos(List<Trabajo> trabajos) {
//	this.trabajos = trabajos;
//}
  
   
  
}