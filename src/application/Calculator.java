package application;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Programa Calculadora");
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int soma;
		int subtracao;
		int multiplicacao;
		double divisao;
		
		System.out.println("Por favor sdigite o Primeiro valor:");
		n1 = sc.nextInt();
		System.out.println("Por favor sdigite o Primeiro valor:");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		subtracao = n1 - n2;
		multiplicacao = n1 * n2;
		divisao = (double) n1 / (double )n2;
		
		System.out.println("A soma é:" + soma);
		System.out.println("A diferença é:"+ subtracao);
		System.out.println("A multiplicacao é:" + multiplicacao);
		System.out.printf("A divisao é: %.2f", divisao);
		
		

	}

}
