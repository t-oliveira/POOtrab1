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
		System.out.println("O onibus está disponível para aluguel !");
		else
			System.out.println("O onibus NAO está disponível !");
	
}
	
void reservar () {
	disponibilidade=false;
	
}
	
void liberar() {
	disponibilidade=true;
}
}
