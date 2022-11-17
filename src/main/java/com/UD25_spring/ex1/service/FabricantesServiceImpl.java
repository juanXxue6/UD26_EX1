package com.UD25_spring.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25_spring.ex1.dao.IFabricantesDAO;
import com.UD25_spring.ex1.dto.Fabricantes;



@Service
public class FabricantesServiceImpl implements IFabricantesService {
	
	@Autowired
	IFabricantesDAO iFabricantesDAO;

	@Override
	public List<Fabricantes> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();	
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricantes FabricantesXID(Long id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricantes(Long id) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById(id);
	}

}
