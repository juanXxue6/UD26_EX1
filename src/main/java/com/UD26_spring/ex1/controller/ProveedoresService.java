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

import com.UD26_spring.ex1.dto.Proveedores;
import com.UD26_spring.ex1.service.ProveedoresServiceImpl;


@RestController
@RequestMapping("/api")
public class ProveedoresService {
	
	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarRegistroProveedores(){
		return proveedoresServiceImpl.listarRegistroProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedores salvarProveedores(@RequestBody Proveedores proveedores) {
		
		return proveedoresServiceImpl.guardarRegistroProveedores(proveedores);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedores RegistroProveedoresXID(@PathVariable(name="id") int id) {
		
		Proveedores proveedores_xid= new Proveedores();
		
		proveedores_xid = proveedoresServiceImpl.registroProveedoresXID(id);
		
	
		
		return proveedores_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")int id,@RequestBody Proveedores proveedores) {
		
		Proveedores proveedores_seleccionado= new Proveedores();
		Proveedores proveedores_actualizado= new Proveedores();
		
		proveedores_seleccionado= proveedoresServiceImpl.registroProveedoresXID(id);
			
		proveedores_seleccionado.setNombre(proveedores.getNombre());

		
		proveedores_actualizado = proveedoresServiceImpl.actualizarRegistroProveedores(proveedores_seleccionado);	
		System.out.println(" suministra actualizado es: "+ proveedores_actualizado);
		
		return proveedores_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarRegistroProveedores(@PathVariable(name="id")int id) {
		proveedoresServiceImpl.eliminarRegistroProveedores(id);
	}
	
}
