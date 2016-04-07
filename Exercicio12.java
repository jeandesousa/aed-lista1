package br.edu.fameg.ads.aed.lista1;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {

	double nota1, nota2, nota3, nota4, media;
	String nome;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite o nome do aluno: ");
	nome = teclado.nextLine();

	System.out.println("Digite a nota: ");
	nota1 = teclado.nextDouble();
	nota1 = (nota1*0.7);
	
	System.out.println("Digite a nota: ");
	nota2 = teclado.nextDouble();
	nota2 = (nota2*0.7);

	System.out.println("Digite a nota: ");
	nota3 = teclado.nextDouble();
	nota3 = (nota3*0.3);

	System.out.println("Digite a nota: ");
	nota4 = teclado.nextDouble();
	nota4 = (nota4*0.3);
	
	media = (nota1+nota2+nota3+nota4)/2;
	
	System.out.println("A média aritmética do aluno " +nome +" é: " +media);
	}
}
