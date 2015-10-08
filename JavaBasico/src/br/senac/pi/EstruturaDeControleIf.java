package br.senac.pi;

public class EstruturaDeControleIf {

	public static void main(String[] args) {
		int idade = 17;

		if (idade >= 18) {
			System.out.println("blz,pode entrar!");
		} else if (idade >= 17) {
			System.out.println("pode entrar com acompanhante");
			// se não se

		} else {
			System.out.println("Vai pra casa dormir rapaz..");
		}
		//Outra construção com IF
		boolean var = true;
		if(var) {
			System.out.println("Isto vai see executado se for true");
		} else {
			System.out.println("Isto vai se executado se for false");
		}
	}

}
