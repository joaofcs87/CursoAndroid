package br.senac.pi;

import java.util.Scanner;

public class MediaAritimedica {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double nota1, nota2, nota3, media;

		System.out.printf("Informe a 1a. nota:\n");
		nota1 = ler.nextDouble();

		System.out.printf("\nInforme a 2a. nota:\n");
		nota2 = ler.nextDouble();

		System.out.printf("\nInforme a 3a. nota:\n");
		nota3 = ler.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.printf("\nMedia final = %.2f", media);

		if (media >= 7.0)
			System.out.printf(" (ALUNO APROVADO).\n");
		else if ((media >= 6.0 && media < 7.0))
			System.out.printf(" (RECUPERÇÃO).\n");
		else
			System.out.printf(" (ALUNO REPROVADO).\n");

	}

}
