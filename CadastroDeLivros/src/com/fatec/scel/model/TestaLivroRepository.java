package com.fatec.scel.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


public class TestaLivroRepository { 
@Test 
public void testISBNCadastrado () {
	 Biblioteca biblioteca = new Biblioteca(); 
	 Livro umLivro = new Livro("2300", " ", "Arthur Conandoile"); 
	 biblioteca.add(umLivro); 
	 assertEquals (0, biblioteca.size()); 
	 System.out.println("Livro Cadastrado");
	
 } 
}

