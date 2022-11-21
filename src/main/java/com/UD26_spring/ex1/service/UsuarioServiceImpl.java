package com.UD26_spring.ex1.service;

import static java.util.Collections.emptyList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.UD26_spring.ex1.dao.IUsuariosDAO;
import com.UD26_spring.ex1.dto.Usuarios;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

	private IUsuariosDAO iUsuarioDAO;

	public UsuarioServiceImpl(IUsuariosDAO iUsuariosDAO) {
		this.iUsuarioDAO = iUsuariosDAO;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios usuario = iUsuarioDAO.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(usuario.getUsername(), usuario.getPassword(), emptyList());
	
	}

}
