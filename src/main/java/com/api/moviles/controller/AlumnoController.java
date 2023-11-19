package com.api.moviles.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.moviles.entity.Alumnos;
import com.api.moviles.servicesIpml.AlumnoServices;
import com.api.moviles.utils.NotFoundException;


@RestController
@RequestMapping("/api")
@CrossOrigin(originPatterns = "*", allowCredentials = "true")
public class AlumnoController {
	
	@Autowired
	AlumnoServices serAlumno;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Alumnos>> lista() {
		return new ResponseEntity<>(serAlumno.listarTodos(), HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Alumnos> buscar(@PathVariable("codigo") Integer codigo) {
		Alumnos u = validarAlumno(codigo);

		serAlumno.buscarPorId(u.getIdAlumno());

		return new ResponseEntity<>(u, HttpStatus.OK);
	}
	
	private Alumnos validarAlumno(Integer codigo) {
		Alumnos u = serAlumno.buscarPorId(codigo);
		if (u == null) {
			throw new NotFoundException();
		}
		return u;
	}
	
	
}
