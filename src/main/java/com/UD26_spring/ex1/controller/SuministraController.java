package com.UD26_spring.ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.UD26_spring.ex1.dto.Suministra;
import com.UD26_spring.ex1.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {
	
	
	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarRegistroPiezas(){
		return suministraServiceImpl.listarRegistroSuministra();
	}
	
	
	@PostMapping("/suministra")
	public Suministra salvarPiezas(@RequestBody Suministra piezas) {
		
		return suministraServiceImpl.guardarRegistroSuministra(piezas);
	}
	
	
	@GetMapping("/suministra/{id}")
	public Suministra RegistroPiezasXID(@PathVariable(name="id") int id) {
		
		Suministra suministra_xid= new Suministra();
		
		suministra_xid = suministraServiceImpl.registroSuministraXID(id);
		
	
		
		return suministra_xid;
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarPiezas(@PathVariable(name="id")int id,@RequestBody Suministra suministra) {
		
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
		
		suministra_seleccionado= suministraServiceImpl.registroSuministraXID(id);
			
		suministra_seleccionado.setPiezas(suministra.getPiezas());
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		suministra_seleccionado.setProveedores(suministra.getProveedores());	
		
		suministra_actualizado = suministraServiceImpl.actualizarRegistroSuministra(suministra_seleccionado);	
		System.out.println(" suministra actualizado es: "+ suministra_actualizado);
		
		return suministra_actualizado;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eleiminarRegistroPiezas(@PathVariable(name="id")int id) {
		suministraServiceImpl.eliminarRegistroSuministra(id);
	}
	
	
	

}
