package com.UD26_spring.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD26_spring.ex1.dao.IProveedoresDAO;
import com.UD26_spring.ex1.dto.Proveedores;


@Service
public class ProveedoresServiceImpl implements IProveedoresService {

	@Autowired
	IProveedoresDAO IProveedoresDAO;
	
	@Override
	public List<Proveedores> listarRegistroProveedores() {
		// TODO Auto-generated method stub
		return IProveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarRegistroProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return IProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores registroProveedoresXID(int id) {
		// TODO Auto-generated method stub
		return IProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarRegistroProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return IProveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarRegistroProveedores(int id) {
		// TODO Auto-generated method stub
		IProveedoresDAO.deleteById(id);
	}

}
