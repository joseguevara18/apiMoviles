package com.api.moviles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_profesor")
@Data
public class Profesores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profesor", nullable = false)
	private int idProfe;
	@Column(name = "nombre_profesor", nullable = false)
	private String nombre;
	@Column(name = "apellido_profesor", nullable = false)
	private String apellido;
	@Column(name = "edad_profesor", nullable = false)
	private int edad;
	@Column(name = "curso_profesor", nullable = false)
	private String curso;
	@Column(name = "usuario_profesor", nullable = false, unique = true)
	private String usuarioProfe;
	@Column(name = "contra_profesor", nullable = false)
	private String contraProfe;
	@Column(name = "dni_profesor", nullable = false)
	private String dniProfe;

}
