package br.senac.pi;

public class Oper��es {

	public static void main(String[] args) {
	
		String nome = "Francisco";
		String sobrenome = "Andr�";
		
		System.out.println("Nome completo: " + nome + sobrenome);
		
		System.out.println("--------------------------------------------");
		int idade = 34;
		boolean brasileiro = true;
		
		System.out.println("Idade: " + idade);
		if (brasileiro) { 
		System.out.println("Brasileiro: " + "sim");
		
	}
	
		System.out.println("Opera�oes matematicas");
		
		int n1 = 10;
		int n2 = 5 ;
		//Saida  formatada com itercal��o de valores
		System.out.printf("A soma entre %d e %d �:", n1, n2);
		System.out.println(n1+n2);// Mostra o resutado
		
		System.out.printf("A multiplic��o entre %d e %d �: ", n1, n2);
		//d= numeros inteiros c=caracteres f=numeros reais s=strings
		System.out.println(n1*n2);
		
		System.out.printf("A subtra��o entre %d e %d �: ", n1, n2);
		System.out.println(n1-n2);
		
		System.out.printf("Divis�o entre %d e %d �: ", n1, n2);
		System.out.println(n1/n2);
				
		System.out.printf("O resto da divis�o entre %d e %d �: ", n1, n2);
		System.out.println(n1%n2);
		//Preced�ncia de avalia��o de operadores
		System.out.println((n1 + n2) * 5);
		
	
		}
}

				
	
			
		

