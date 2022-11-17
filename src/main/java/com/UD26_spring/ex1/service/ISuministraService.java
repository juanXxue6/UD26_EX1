package com.UD26_spring.ex1.service;

import java.util.List;


import com.UD26_spring.ex1.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarRegistroSuministra(); 
	
	public Suministra guardarRegistroSuministra(Suministra suministra);	
	
	public Suministra registroSuministraXID(int id); 
	
	public Suministra actualizarRegistroSuministra(Suministra suministra); 
	
	public void eliminarRegistroSuministra(int id);
	
	
	
}
