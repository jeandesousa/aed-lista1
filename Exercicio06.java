package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {

	double pi, num3, num4;
	int num1; 
	
	num1 = 4;
	pi = 3.14;

	System.out.println("Digite o raio da esfera: ");
	Scanner teclado = new Scanner(System.in);
	num3 = teclado.nextDouble();
	
	num4 = (num1*pi*num3*num3);
	
	System.out.println("A área superficial da esfera é igual a "+ num4);
	}
}
