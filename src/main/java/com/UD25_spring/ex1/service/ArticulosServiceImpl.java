package com.UD25_spring.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25_spring.ex1.dao.IArticulosDAO;
import com.UD25_spring.ex1.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticuloService {

	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulos) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulos);
	}

	@Override
	public Articulos ArticulossXID(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulos) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulos);
	}

	@Override
	public void eliminarArticulos(Long id) {
		// TODO Auto-generated method stub
		iArticulosDAO.deleteById(id);
	}
	
	
}
