package com.UD26_spring.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD26_spring.ex1.dao.IPiezasDAO;
import com.UD26_spring.ex1.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService {
	
	@Autowired
	IPiezasDAO iPiezasDAO;

	@Override
	public List<Piezas> listarRegistroPiezas() {
		// TODO Auto-generated method stub
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas guardarRegistroPiezas(Piezas piezas) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(piezas);
	}

	@Override
	public Piezas registroPiezasXID(int id) {
		// TODO Auto-generated method stub
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public Piezas actualizarRegistroPiezas(Piezas piezas) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(piezas);
	}

	@Override
	public void eliminarRegistroPiezas(int id) {
		// TODO Auto-generated method stub
		iPiezasDAO.deleteById(id);
	}
	
	
	
	
	

}
