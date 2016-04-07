package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {

	double pi, num2, num3, num4;
	
	pi = 3.14;

	System.out.println("Digite o raio do cone: ");
	Scanner teclado = new Scanner(System.in);
	num2 = teclado.nextDouble();
	
	System.out.println("Digite o raio do cone: ");
	Scanner teclado2 = new Scanner(System.in);
	num3 = teclado.nextDouble();
	
	num4 = (pi*num2*num3);
	
	System.out.println("A área do cone é igual a "+ num4);
	}
}
