package com.UD25_spring.ex1.service;

import java.util.List;

import com.UD25_spring.ex1.dto.Articulos;


public interface IArticuloService {
	
	public List<Articulos> listarArticulos(); //Listar All 
	
	public Articulos guardarArticulos(Articulos articulos);	//Guarda un Fabricantes CREATE
	
	public Articulos ArticulossXID(Long id); //Leer datos de un Fabricantes READ
	
	public Articulos actualizarArticulos(Articulos articulos); //Actualiza datos del Fabricantes UPDATE
	
	public void eliminarArticulos(Long id);// Elimina el Fabricantes DELETE
	
}
