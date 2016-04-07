package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {

	double pi, num2, num3, num4;
	
	pi = 3.14;
	num2 = 1.33;

	System.out.println("Digite o raio da esfera: ");
	Scanner teclado = new Scanner(System.in);
	num3 = teclado.nextDouble();
	
	num4 = (num2*pi*num3*num3*num3);
	
	System.out.println("O volume da esfera é igual a "+ num4);
	}
}
