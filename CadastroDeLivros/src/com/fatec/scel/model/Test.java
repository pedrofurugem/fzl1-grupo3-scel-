package com.fatec.scel.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

class Test {

	   void ct01_cadastra_livro_com_sucesso() { 
		 Biblioteca biblioteca = new Biblioteca(); 
		 Livro umLivro = new Livro("2300", "Sherlock Holmes - O vale do medo", "Arthur Conandoile"); 
		 biblioteca.add(umLivro); 
		 assertEquals (1, biblioteca.size()); 
		 System.out.println("Livro Cadastrado");
		} 

	     void ct02_cadastra_livro_com_sucesso() { 
		 Biblioteca biblioteca = new Biblioteca(); 
		 Livro umLivro = new Livro("2300", "Sherlock Holmes - O vale do medo", "Arthur Conandoile"); 
		 biblioteca.add(umLivro); 
		 List<Livro> lista = biblioteca.getLivros(); 
		 assertEquals("Sherlock Holmes - O vale do medo", lista.get(0).getTitulo()); 
		 System.out.println("Livro Cadastrado");
	   }
}

