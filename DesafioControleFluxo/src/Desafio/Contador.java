package Desafio;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parametro:");
		int parametroUm = entrada.nextInt();
		
		System.out.print("Digite o segundo parametro:");
		int parametroDois = entrada.nextInt();
		
		
		try {
			
			contar(parametroUm, parametroDois); //chamando o método contendo a lógica de contagem
			
		} catch(ParametrosInvalidosException e) {
			
			System.out.println(e.getMessage());//imprimir a mensagem:
		
		}
		
		entrada.close();
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior");
		
		int resultado = parametroDois - parametroUm;
		

		for(int contar = 1; contar <= resultado; contar++ ) //realizar o for para imprimir os números com base na variável contagem
			
			System.out.println("Impimindo o número " + contar);
		
	}

}
