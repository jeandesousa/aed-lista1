package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int num1, num2;
		System.out.println("Digite o lado do cubo quadrado: ");
		Scanner teclado = new Scanner(System.in);
		num1 = teclado.nextInt();
		num2 = (num1 * num1 * num1);
		System.out.println("A �rea do cubo quadrado � "+num2);
	}

}
