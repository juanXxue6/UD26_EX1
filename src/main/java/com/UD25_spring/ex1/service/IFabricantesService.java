package com.UD25_spring.ex1.service;

import java.util.List;

import com.UD25_spring.ex1.dto.Fabricantes;

public interface IFabricantesService {
	
	
	//Metodos del CRUD
	public List<Fabricantes> listarFabricantes(); //Listar All 
	
	public Fabricantes guardarFabricantes(Fabricantes fabricante);	//Guarda un Fabricantes CREATE
	
	public Fabricantes FabricantesXID(Long id); //Leer datos de un Fabricantes READ
	
	public Fabricantes actualizarFabricantes(Fabricantes fabricante); //Actualiza datos del Fabricantes UPDATE
	
	public void eliminarFabricantes(Long id);// Elimina el Fabricantes DELETE
	
	

}
