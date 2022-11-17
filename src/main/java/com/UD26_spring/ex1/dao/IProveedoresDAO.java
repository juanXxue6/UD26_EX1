package com.UD26_spring.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UD26_spring.ex1.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, Integer> {

}
