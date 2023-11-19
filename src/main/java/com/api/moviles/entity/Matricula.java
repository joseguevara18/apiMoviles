package com.api.moviles.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_matricula")
@Data
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matricula", nullable = false)
	private int idMatricula;
	@Column(name = "nombre_matriculado", nullable = false)
	private String nombre;
	@Column(name = "apellido_matriculado", nullable = false)
	private String apellido;
	@Column(name = "dni_matriculado", nullable = false)
	private String dni;
	@Column(name = "fecha_matriculado", nullable = false)
	private LocalDate fechaRegistro;

}
