package com.api.moviles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.moviles.entity.Alumnos;

public interface AlumnosRepository extends JpaRepository<Alumnos, Integer>{
	
	@Query("SELECT a FROM Alumnos a WHERE a.estado.idEstado = :codigoestado")
	List<Alumnos> findByCodigoEstado(int codigoestado);
	
	@Query("select a from Alumnos a where a.nombres like ?1")
	public List<Alumnos> listaPorNombreLike(String nombres);

	
	public abstract Alumnos findByEmail(String email);
	
	public boolean existsByEmail(String correo);
}
