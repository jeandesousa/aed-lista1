package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {

	double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media;
	int i;
	
	Scanner teclado = new Scanner(System.in);
	
	for (i = 0; i < 4; i++){ 
		
	System.out.println("Digite a nota: ");
	nota1 = teclado.nextDouble();
	nota2 = teclado.nextDouble();
	nota3 = teclado.nextDouble();
	nota4 = teclado.nextDouble();
	break;
	}
	
	media = (nota1 + nota2 + nota3 + nota4)/4;
	
	System.out.println("A média aritmética é igual a " + media);
	}
}
