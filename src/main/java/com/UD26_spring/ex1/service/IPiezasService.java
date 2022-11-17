package com.UD26_spring.ex1.service;

import java.util.List;

import com.UD26_spring.ex1.dto.Piezas;


public interface IPiezasService {

	public List<Piezas> listarRegistroPiezas(); 
	
	public Piezas guardarRegistroPiezas(Piezas piezas);	
	
	public Piezas registroPiezasXID(int id); 
	
	public Piezas actualizarRegistroPiezas(Piezas piezas); 
	
	public void eliminarRegistroPiezas(int id);
	
}
