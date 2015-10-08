package br.senac.pi;

public class Operções {

	public static void main(String[] args) {
	
		String nome = "Francisco";
		String sobrenome = "André";
		
		System.out.println("Nome completo: " + nome + sobrenome);
		
		System.out.println("--------------------------------------------");
		int idade = 34;
		boolean brasileiro = true;
		
		System.out.println("Idade: " + idade);
		if (brasileiro) { 
		System.out.println("Brasileiro: " + "sim");
		
	}
	
		System.out.println("Operaçoes matematicas");
		
		int n1 = 10;
		int n2 = 5 ;
		//Saida  formatada com itercalção de valores
		System.out.printf("A soma entre %d e %d é:", n1, n2);
		System.out.println(n1+n2);// Mostra o resutado
		
		System.out.printf("A multiplicção entre %d e %d é: ", n1, n2);
		//d= numeros inteiros c=caracteres f=numeros reais s=strings
		System.out.println(n1*n2);
		
		System.out.printf("A subtração entre %d e %d é: ", n1, n2);
		System.out.println(n1-n2);
		
		System.out.printf("Divisão entre %d e %d é: ", n1, n2);
		System.out.println(n1/n2);
				
		System.out.printf("O resto da divisão entre %d e %d é: ", n1, n2);
		System.out.println(n1%n2);
		//Precedência de avaliação de operadores
		System.out.println((n1 + n2) * 5);
		
	
		}
}

				
	
			
		

