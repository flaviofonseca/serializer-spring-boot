package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@GetMapping("/findByNome")
	public Pessoa findByNome(String nome) {
		Pessoa pessoa = new Pessoa(1l, "Flavio", LocalDate.now());
		System.out.println(pessoa);
		return pessoa;
	}
	
	@PostMapping("/salvar")
	public void salvar(@RequestBody Pessoa pessoa) {
		System.out.println(pessoa);
	}

}
