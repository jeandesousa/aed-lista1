package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {

	double pi, num3;
	int num2;
	
	pi = 3.14;
	
	System.out.println("Digite o raio do circulo: ");
	Scanner teclado = new Scanner(System.in);
	num2 = teclado.nextInt();
	
	num3 = (pi*num2*num2);
	
	System.out.println("A área do círculo é igual a: "+ num3);
	}
}
