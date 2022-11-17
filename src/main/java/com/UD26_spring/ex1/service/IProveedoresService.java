package com.UD26_spring.ex1.service;

import java.util.List;


import com.UD26_spring.ex1.dto.Proveedores;

public interface IProveedoresService {

	public List<Proveedores> listarRegistroProveedores(); 
	
	public Proveedores guardarRegistroProveedores(Proveedores proveedores);	
	
	public Proveedores registroProveedoresXID(int id); 
	
	public Proveedores actualizarRegistroProveedores(Proveedores proveedores); 
	
	public void eliminarRegistroProveedores(int id);
	
	
}
