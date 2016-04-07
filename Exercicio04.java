package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {

	double pi, num3, num4;
	int num1; 
	
	num1 = 2;
	pi = 3.14;
	
	System.out.println("Digite o raio do circulo: ");
	Scanner teclado = new Scanner(System.in);
	num3 = teclado.nextDouble();
	
	num4 = (num1*pi*num3);
	
	System.out.println("O comprimento da circunferência é igual a "+ num4);
	}
}
