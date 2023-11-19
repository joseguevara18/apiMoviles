package com.api.moviles.servicesIpml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.api.moviles.entity.Estado;
import com.api.moviles.repository.EstadoRepository;

@Service
public abstract class EstadoServices extends ICRUDImpl<Estado, Integer> {
	
	@Autowired
	private EstadoRepository repo;

	@Override
	public JpaRepository<Estado, Integer> getRepository() {
		return repo;
	}

}
