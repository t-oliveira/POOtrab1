package br.lasalle.oop.trab1;

public class Onibus {
	
	// Atributos dessa classe
	String categoria;
	String trecho;
	int lugares;
	boolean disponibilidade;
	float preco;

	
void status () {
	
	if(disponibilidade) 
		System.out.println("O onibus est� dispon�vel para aluguel !");
		else
			System.out.println("O onibus NAO est� dispon�vel !");
	
}
	
void reservar () {
	disponibilidade=false;
	
}
	
void liberar() {
	disponibilidade=true;
}
}
