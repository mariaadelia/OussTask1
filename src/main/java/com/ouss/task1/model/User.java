package com.ouss.task1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 60)
	private String nome;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	@Size(min = 2, max = 60)
	private String senha;
	
	public User() {
		
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}		

}
