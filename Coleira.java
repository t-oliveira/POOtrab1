package br.lasalle.oop.trab1;

public class Coleira {
	// Atributos dessa classe
	String tipo;
	String cor;
	String tamanho;
	boolean estado;
	
	void status() {
		
		if(estado) 
			System.out.println("O cachorro está solto no quintal !");
			else
				System.out.println("O cachorro está preso e de coleira !");
		
	}
		
	void soltar () {
		estado=true;
		
	}
		
	void prender() {
		estado=false;
	}
	}



