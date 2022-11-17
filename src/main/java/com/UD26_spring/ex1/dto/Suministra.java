package com.UD26_spring.ex1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="suministra")
public class Suministra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@ManyToOne
    @JoinColumn(name = "piezas_id")
    Piezas piezas;
 
    @ManyToOne
    @JoinColumn(name = "proveedores_id")
    Proveedores proveedores;

    public Suministra() {}

	public Suministra(int id, Piezas piezas, Proveedores proveedores, int precio) {
		this.id = id;
		this.piezas = piezas;
		this.precio = precio;
		this.proveedores = proveedores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Piezas getPiezas() {
		return piezas;
	}

	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	public Proveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", piezas=" + piezas + ", proveedores=" + proveedores + "]";
	}
    
    
    
}
