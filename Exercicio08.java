package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {

	double pi, num2, num3, num4;
	
	pi = 3.14;

	System.out.println("Digite o raio do cilindro: ");
	Scanner teclado = new Scanner(System.in);
	num2 = teclado.nextDouble();
	
	System.out.println("Digite o altura do cilindro: ");
	Scanner teclado2 = new Scanner(System.in);
	num3 = teclado.nextDouble();
	
	num4 = (pi*num2*num2*num3);
	
	System.out.println("O volume do cilindro é igual a "+ num4);
	}
}
