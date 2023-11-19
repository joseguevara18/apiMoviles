package com.api.moviles.servicesIpml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.api.moviles.entity.Alumnos;
import com.api.moviles.repository.AlumnosRepository;

@Service
public abstract class AlumnoServices extends ICRUDImpl<Alumnos, Integer> {
	
	@Autowired
	private AlumnosRepository repo;

	@Override
	public JpaRepository<Alumnos, Integer> getRepository() {
		return repo;
	}
	
	public List<Alumnos> buscarPorGenero(int codigoestado) {
	    return repo.findByCodigoEstado(codigoestado);
	}
	
	public List<Alumnos> obtenerNombreAlumno(String nombres) {
        return repo.listaPorNombreLike(nombres);
    }


    public Alumnos findByEmail(String email) {
        return repo.findByEmail(email);
    }
    
    public Boolean existeEmail(String email) {
        return repo.existsByEmail(email);
    }
}
