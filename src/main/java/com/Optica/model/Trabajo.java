/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Optica.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name="trabajos")
public class Trabajo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL
	private   int idtra;
	
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idcli",  nullable = false)
	private   int idcli;
	private   int numtrabajo;
	private   String fechatrabajo;
	private   String entrega;
	private   String doctor;
	private   String servicio;
	private   String odesflejos;
	private   String odcillejos;
	private   String odejelejos;
	private   String oddilejos;
	private   String armazonpreciolejos;
	private   String oiesflejos;
	private   String oicillejos;
	private   String oiejelejos;
	private   String oidilejos;
	private   String armazontipolejos;
	private   String odesfintermedio;
	private   String odcilintermedio;
	private   String odejeintermedio;
	private   String oddiintermedio;
	private   String armazonpreciointermedio;
	private   String oiesfintermedio;
	private   String oicilintermedio;
	private   String oiejeintermedio;
	private   String oidiintermedio;
	private   String armazontipointermedio;
	private   String odesfcerca;
	private   String odcilcerca;
	private   String odejecerca;
	private   String oddicerca;
	private   String armazonpreciocerca;
	private   String oiesfcerca;
	private   String oicilcerca;
	private   String oiejecerca;
	private   String oidicerca;
	private   String armazontipocerca;
	private   String cristaleslejos;
	private   String bifocalalt;
	private   String preciocristaleslejos;
	private   String cristalescerca;
	private   String multifocalalt;
	private   String preciocristalescerca;
	private   String observaciones;
	private   String preciototal;
    
    
    public void Trabajo(){
        
    }

    
    public void setIdtra(int idtra) {
		this.idtra = idtra;
	}


	public int getIdtra() {
		return idtra;
	}


	


	


	public int getIdcli() {
		return idcli;
	}


	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}


	public String getFechatrabajo() {
		return fechatrabajo;
	}


	public void setFechatrabajo(String fechatrabajo) {
		this.fechatrabajo = fechatrabajo;
	}


	public String getCristaleslejos() {
		return cristaleslejos;
	}


	public void setCristaleslejos(String cristaleslejos) {
		this.cristaleslejos = cristaleslejos;
	}


	public String getPreciocristaleslejos() {
		return preciocristaleslejos;
	}


	public void setPreciocristaleslejos(String preciocristaleslejos) {
		this.preciocristaleslejos = preciocristaleslejos;
	}


	public String getCristalescerca() {
		return cristalescerca;
	}


	public void setCristalescerca(String cristalescerca) {
		this.cristalescerca = cristalescerca;
	}


	public String getMultifocalalt() {
		return multifocalalt;
	}


	public void setMultifocalalt(String multifocalalt) {
		this.multifocalalt = multifocalalt;
	}


	public String getPreciocristalescerca() {
		return preciocristalescerca;
	}


	public void setPreciocristalescerca(String preciocristalescerca) {
		this.preciocristalescerca = preciocristalescerca;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public int getNumtrabajo() {
        return numtrabajo;
    }

    public void setNumtrabajo(int numtrabajo) {
        this.numtrabajo = numtrabajo;
    }

    public String getFechatra() {
        return fechatrabajo;
    }

    public void setFechatra(String fechatra) {
        this.fechatrabajo = fechatra;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getOdesflejos() {
        return odesflejos;
    }

    public void setOdesflejos(String odesflejos) {
        this.odesflejos = odesflejos;
    }

    public String getOdcillejos() {
        return odcillejos;
    }

    public void setOdcillejos(String odcillejos) {
        this.odcillejos = odcillejos;
    }

    public String getOdejelejos() {
        return odejelejos;
    }

    public void setOdejelejos(String odejelejos) {
        this.odejelejos = odejelejos;
    }

    public String getOddilejos() {
        return oddilejos;
    }

    public void setOddilejos(String oddilejos) {
        this.oddilejos = oddilejos;
    }

    public String getArmazonpreciolejos() {
        return armazonpreciolejos;
    }

    public void setArmazonpreciolejos(String armazonpreciolejos) {
        this.armazonpreciolejos = armazonpreciolejos;
    }

    public String getOiesflejos() {
        return oiesflejos;
    }

    public void setOiesflejos(String oiesflejos) {
        this.oiesflejos = oiesflejos;
    }

    public String getOicillejos() {
        return oicillejos;
    }

    public void setOicillejos(String oicillejos) {
        this.oicillejos = oicillejos;
    }

    public String getOiejelejos() {
        return oiejelejos;
    }

    public void setOiejelejos(String oiejelejos) {
        this.oiejelejos = oiejelejos;
    }

    public String getOidilejos() {
        return oidilejos;
    }

    public void setOidilejos(String oidilejos) {
        this.oidilejos = oidilejos;
    }

    public String getArmazontipolejos() {
        return armazontipolejos;
    }

    public void setArmazontipolejos(String armazontipolejos) {
        this.armazontipolejos = armazontipolejos;
    }

    public String getOdesfintermedio() {
        return odesfintermedio;
    }

    public void setOdesfintermedio(String odesfintermedio) {
        this.odesfintermedio = odesfintermedio;
    }

    public String getOdcilintermedio() {
        return odcilintermedio;
    }

    public void setOdcilintermedio(String odcilintermedio) {
        this.odcilintermedio = odcilintermedio;
    }

    public String getOdejeintermedio() {
        return odejeintermedio;
    }

    public void setOdejeintermedio(String odejeintermedio) {
        this.odejeintermedio = odejeintermedio;
    }

    public String getOddiintermedio() {
        return oddiintermedio;
    }

    public void setOddiintermedio(String oddiintermedio) {
        this.oddiintermedio = oddiintermedio;
    }

    public String getArmazonpreciointermedio() {
        return armazonpreciointermedio;
    }

    public void setArmazonpreciointermedio(String armazonpreciointermedio) {
        this.armazonpreciointermedio = armazonpreciointermedio;
    }

    public String getOiesfintermedio() {
        return oiesfintermedio;
    }

    public void setOiesfintermedio(String oiesfintermedio) {
        this.oiesfintermedio = oiesfintermedio;
    }

    public String getOicilintermedio() {
        return oicilintermedio;
    }

    public void setOicilintermedio(String oicilintermedio) {
        this.oicilintermedio = oicilintermedio;
    }

    public String getOiejeintermedio() {
        return oiejeintermedio;
    }

    public void setOiejeintermedio(String oiejeintermedio) {
        this.oiejeintermedio = oiejeintermedio;
    }

    public String getOidiintermedio() {
        return oidiintermedio;
    }

    public void setOidiintermedio(String oidiintermedio) {
        this.oidiintermedio = oidiintermedio;
    }

    public String getArmazontipointermedio() {
        return armazontipointermedio;
    }

    public void setArmazontipointermedio(String armazontipointermedio) {
        this.armazontipointermedio = armazontipointermedio;
    }

    public String getOdesfcerca() {
        return odesfcerca;
    }

    public void setOdesfcerca(String odesfcerca) {
        this.odesfcerca = odesfcerca;
    }

    public String getOdcilcerca() {
        return odcilcerca;
    }

    public void setOdcilcerca(String odcilcerca) {
        this.odcilcerca = odcilcerca;
    }

    public String getOdejecerca() {
        return odejecerca;
    }

    public void setOdejecerca(String odejecerca) {
        this.odejecerca = odejecerca;
    }

    public String getOddicerca() {
        return oddicerca;
    }

    public void setOddicerca(String oddicerca) {
        this.oddicerca = oddicerca;
    }

    public String getArmazonpreciocerca() {
        return armazonpreciocerca;
    }

    public void setArmazonpreciocerca(String armazonpreciocerca) {
        this.armazonpreciocerca = armazonpreciocerca;
    }

    public String getOiesfcerca() {
        return oiesfcerca;
    }

    public void setOiesfcerca(String oiesfcerca) {
        this.oiesfcerca = oiesfcerca;
    }

    public String getOicilcerca() {
        return oicilcerca;
    }

    public void setOicilcerca(String oicilcerca) {
        this.oicilcerca = oicilcerca;
    }

    public String getOiejecerca() {
        return oiejecerca;
    }

    public void setOiejecerca(String oiejecerca) {
        this.oiejecerca = oiejecerca;
    }

    public String getOidicerca() {
        return oidicerca;
    }

    public void setOidicerca(String oidicerca) {
        this.oidicerca = oidicerca;
    }

    public String getArmazontipocerca() {
        return armazontipocerca;
    }

    public void setArmazontipocerca(String armazontipocerca) {
        this.armazontipocerca = armazontipocerca;
    }

    public String getCrislejos() {
        return cristaleslejos;
    }

    public void setCrislejos(String crislejos) {
        this.cristaleslejos = crislejos;
    }

    public String getBifocalalt() {
        return bifocalalt;
    }

    public void setBifocalalt(String bifocalalt) {
        this.bifocalalt = bifocalalt;
    }

    public String getPreciolejos() {
        return preciocristaleslejos;
    }

    public void setPreciolejos(String preciolejos) {
        this.preciocristaleslejos = preciolejos;
    }

    public String getCriscerca() {
        return cristalescerca;
    }

    public void setCriscerca(String criscerca) {
        this.cristalescerca = criscerca;
    }

    public String getMultialt() {
        return multifocalalt;
    }

    public void setMultialt(String multialt) {
        this.multifocalalt = multialt;
    }

    public String getPreciocerca() {
        return preciocristalescerca;
    }

    public void setPreciocerca(String preciocerca) {
        this.preciocristalescerca = preciocerca;
    }

    public String getComentariosnue() {
        return observaciones;
    }

    public void setComentariosnue(String comentariosnue) {
        this.observaciones = comentariosnue;
    }

    public String getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(String preciototal) {
        this.preciototal = preciototal;
    }


	@Override
	public String toString() {
		return "Trabajo [idtra=" + idtra + ", numtrabajo=" + numtrabajo + ", fechatrabajo="
				+ fechatrabajo + ", entrega=" + entrega + ", doctor=" + doctor + ", servicio=" + servicio
				+ ", odesflejos=" + odesflejos + ", odcillejos=" + odcillejos + ", odejelejos=" + odejelejos
				+ ", oddilejos=" + oddilejos + ", armazonpreciolejos=" + armazonpreciolejos + ", oiesflejos="
				+ oiesflejos + ", oicillejos=" + oicillejos + ", oiejelejos=" + oiejelejos + ", oidilejos=" + oidilejos
				+ ", armazontipolejos=" + armazontipolejos + ", odesfintermedio=" + odesfintermedio
				+ ", odcilintermedio=" + odcilintermedio + ", odejeintermedio=" + odejeintermedio + ", oddiintermedio="
				+ oddiintermedio + ", armazonpreciointermedio=" + armazonpreciointermedio + ", oiesfintermedio="
				+ oiesfintermedio + ", oicilintermedio=" + oicilintermedio + ", oiejeintermedio=" + oiejeintermedio
				+ ", oidiintermedio=" + oidiintermedio + ", armazontipointermedio=" + armazontipointermedio
				+ ", odesfcerca=" + odesfcerca + ", odcilcerca=" + odcilcerca + ", odejecerca=" + odejecerca
				+ ", oddicerca=" + oddicerca + ", armazonpreciocerca=" + armazonpreciocerca + ", oiesfcerca="
				+ oiesfcerca + ", oicilcerca=" + oicilcerca + ", oiejecerca=" + oiejecerca + ", oidicerca=" + oidicerca
				+ ", armazontipocerca=" + armazontipocerca + ", cristaleslejos=" + cristaleslejos + ", bifocalalt="
				+ bifocalalt + ", preciocristaleslejos=" + preciocristaleslejos + ", cristalescerca=" + cristalescerca
				+ ", multifocalalt=" + multifocalalt + ", preciocristalescerca=" + preciocristalescerca
				+ ", observaciones=" + observaciones + ", preciototal=" + preciototal + "]";
	}
    
    
    
}
