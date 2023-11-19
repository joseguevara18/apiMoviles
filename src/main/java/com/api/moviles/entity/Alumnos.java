package com.api.moviles.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_alumno")
@Data
public class Alumnos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profesor", nullable = false)
	private int idAlumno;
	@Column(name = "nombre_alumno", nullable = false)
	private String nombre;
	@Column(name = "apellido_alumno", nullable = false)
	private String apellido;
	@Column(name = "edad_alumno", nullable = false)
	private int edad;
	@Column(name = "curso_alumno", nullable = false)
	private String curso;
	@Column(name = "usuario_alumno", nullable = false, unique = true)
	private String usuarioAlumno;
	@Column(name = "contra_alumno", nullable = false)
	private String contraAlumno;
	@Column(name = "fecha_registro", nullable = false)
	private LocalDate fecha;
	@Column(name = "dni_alumno", nullable = false)
	private String dniAlumno;
	@Column(name = "estado_alumno", nullable = false)
	private String estado;
	

}
