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

import com.UD26_spring.ex1.dto.Piezas;
import com.UD26_spring.ex1.service.PiezasServiceImpl;




@RestController
@RequestMapping("/api")
public class PiezasController {
	
	@Autowired
	PiezasServiceImpl piezasServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listarRegistroPiezas(){
		return piezasServiceImpl.listarRegistroPiezas();
	}
	
	
	@PostMapping("/piezas")
	public Piezas salvarPiezas(@RequestBody Piezas piezas) {
		
		return piezasServiceImpl.guardarRegistroPiezas(piezas);
	}
	
	
	@GetMapping("/piezas/{id}")
	public Piezas RegistroPiezasXID(@PathVariable(name="id") int id) {
		
		Piezas piezas_xid= new Piezas();
		
		piezas_xid = piezasServiceImpl.registroPiezasXID(id);
		
	
		
		return piezas_xid;
	}
	
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPiezas(@PathVariable(name="id")int id,@RequestBody Piezas piezas) {
		
		Piezas piezas_seleccionado= new Piezas();
		Piezas piezas_actualizado= new Piezas();
		
		piezas_seleccionado= piezasServiceImpl.registroPiezasXID(id);
			
		piezas_seleccionado.setNombre(piezas.getNombre());		
		piezas_actualizado = piezasServiceImpl.actualizarRegistroPiezas(piezas_seleccionado);	
		System.out.println("la piezas actualizado es: "+ piezas_actualizado);
		
		return piezas_actualizado;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eleiminarRegistroPiezas(@PathVariable(name="id")int id) {
		piezasServiceImpl.eliminarRegistroPiezas(id);
	}
	

}
