package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {

	double pi, num3, num4, num5;
	int num1; 
	
	num1 = 2;
	pi = 3.14;

	System.out.println("Digite o raio do cilindro: ");
	Scanner teclado = new Scanner(System.in);
	num3 = teclado.nextDouble();
	
	System.out.println("Digite o altura do cilindro: ");
	Scanner teclado2 = new Scanner(System.in);
	num4 = teclado.nextDouble();
	
	num5 = (num1*pi*num3*num4);
	
	System.out.println("A área superficial do cilindro é igual a "+ num5);
	}
}
