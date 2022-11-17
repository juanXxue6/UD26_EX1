package com.UD25_spring.ex1.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulos")
public class Articulos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante")
    private Fabricantes fabricante;

	public Articulos() {
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param fabricante
	 */
	
	public Articulos(Long id, String nombre, int precio, Fabricantes fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	public Fabricantes getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}
  
    
}
