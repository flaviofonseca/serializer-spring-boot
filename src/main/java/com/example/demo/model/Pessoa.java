package com.example.demo.model;

import java.time.LocalDate;

public class Pessoa {

	private Long id;

	private String nome;

	private LocalDate dataNascimento;

	public Pessoa() {
	}

	public Pessoa(Long id, String nome, LocalDate dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
	
}
