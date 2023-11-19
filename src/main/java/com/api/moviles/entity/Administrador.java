package com.api.moviles.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_administrador")
@Data
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_administrador", nullable = false)
	private int id;
	@Column(name = "usuario_administrador", nullable = false, unique = true)
	private String usuario;
	@Column(name = "contrasena_administrador", nullable = false)
	private String contra;
	
}
