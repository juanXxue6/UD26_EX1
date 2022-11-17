package com.UD25_spring.ex1.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="fabricantes")
public class Fabricantes {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

 //busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;	
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Articulos> articulos;

    public Fabricantes() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param articulos
	 */
    
	public Fabricantes(Long id, String nombre, List<Articulos> articulos) {
		this.id = id;
		this.nombre = nombre;
		this.articulos = articulos;
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


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "articulos")
	public List<Articulos> getArticulos() {
		return articulos;
	}

	/**
	 * @param video the video to set
	 */
	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}




	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + ", articulos=" + articulos + "]";
	}

	
	
	
	
}
