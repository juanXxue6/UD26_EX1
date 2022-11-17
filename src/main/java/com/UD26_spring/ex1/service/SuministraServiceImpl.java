package com.UD26_spring.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD26_spring.ex1.dao.ISuministraDAO;
import com.UD26_spring.ex1.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listarRegistroSuministra() {
		// TODO Auto-generated method stub
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarRegistroSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra registroSuministraXID(int id) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarRegistroSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarRegistroSuministra(int id) {
		// TODO Auto-generated method stub
		iSuministraDAO.deleteById(id);
	}

}
