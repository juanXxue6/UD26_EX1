package com.UD25_spring.ex1.controller;

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

import com.UD25_spring.ex1.dto.Fabricantes;
import com.UD25_spring.ex1.service.FabricantesServiceImpl;
import com.UD25_spring.ex1.service.IFabricantesService;


@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarClientes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarCliente(@RequestBody Fabricantes fabricante) {
		
		return fabricantesServiceImpl.guardarFabricantes(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricantes clienteXID(@PathVariable(name="id") Long id) {
		
		Fabricantes cliente_xid= new Fabricantes();
		
		cliente_xid=fabricantesServiceImpl.FabricantesXID(id);
		
		System.out.println("fabricantes XID: "+cliente_xid);
		
		return cliente_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado= new Fabricantes();
		Fabricantes fabricante_actualizado= new Fabricantes();
		
		fabricante_seleccionado= fabricantesServiceImpl.FabricantesXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricantesServiceImpl.actualizarFabricantes(fabricante_seleccionado);
		
		System.out.println("El fabricantes actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarCliente(@PathVariable(name="id")Long id) {
		fabricantesServiceImpl.eliminarFabricantes(id);
	}
	
	
	
	
	
	
	
	
	
}
