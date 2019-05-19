package com.br.exercicio.um;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int controle = 1;
		while (controle > 0) {
			System.out.println("Qual será o valor de A?");
			int valorA = scan.nextInt();
			
			System.out.println("Qual será o valor de B?");
			int valorB = scan.nextInt();
			
			//-------------------------------
			
			int troca = valorA;
			
			valorA = valorB;
			
			valorB = troca;
			
			//--------------------------------
			
			System.out.println("O valor trocado de A é " + valorA + ", e o valor de B é " + valorB);
			
			System.out.println("Digite 1 para continuar no programa ou -1 para sair");
			controle = scan.nextInt();
			
		}
		
	}

}
