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

import com.UD25_spring.ex1.dto.Articulos;
import com.UD25_spring.ex1.service.ArticulosServiceImpl;


@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articulosServideImpl;
	
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articulosServideImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarVideo(@RequestBody Articulos articulos) {
		
		return articulosServideImpl.guardarArticulos(articulos);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos videoXID(@PathVariable(name="id") Long id) {
		
		Articulos articulo_xid= new Articulos();
		
		articulo_xid= articulosServideImpl.ArticulossXID(id);
		
		System.out.println("Video XID: "+articulo_xid);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarVideo(@PathVariable(name="id")Long id,@RequestBody Articulos articulos) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articulosServideImpl.ArticulossXID(id);
		
		articulo_seleccionado.setFabricante(articulos.getFabricante());
		articulo_seleccionado.setNombre(articulos.getNombre());
		articulo_seleccionado.setPrecio(articulos.getPrecio());
		
		articulo_actualizado = articulosServideImpl.actualizarArticulos(articulo_seleccionado);
		
		System.out.println("El video actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarVideo(@PathVariable(name="id")Long id) {
		articulosServideImpl.eliminarArticulos(id);
	}
	
	
}
