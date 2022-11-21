package com.UD26_spring.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UD26_spring.ex1.dto.Usuarios;

public interface IUsuariosDAO extends JpaRepository<Usuarios, Long> {

	Usuarios findByUsername(String username);
}
