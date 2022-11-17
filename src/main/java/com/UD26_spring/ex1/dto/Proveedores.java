package com.UD26_spring.ex1.dto;

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
@Table(name="proveedores")
public class Proveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Suministra> registroCurso;

	public Proveedores() {}
	
	public Proveedores(int id, String nombre, List<Suministra> registroCurso) {
		this.id = id;
		this.nombre = nombre;
		this.registroCurso = registroCurso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RegistroCurso")
	public List<Suministra> getRegistroCurso() {
		return registroCurso;
	}

	public void setRegistroCurso(List<Suministra> registroCurso) {
		this.registroCurso = registroCurso;
	}

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + ", registroCurso=" + registroCurso + "]";
	}
	
	

}
