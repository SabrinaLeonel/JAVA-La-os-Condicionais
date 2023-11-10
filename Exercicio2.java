package atividadejava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int nA, nB, nC, soma; 
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o número A: ");
		nA  = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		nB  = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		nC  = leia.nextInt();
		
		soma = nA + nB; 
				
		//se o resultado da soma do número A + o número B for maior que o número C
		if(soma > nC) {

			System.out.println(nA + " + " + nB + " = " + soma + " > " + nC);
			System.out.print("A Soma de A + B é Maior do que C");
		}
		
		//se o resultado da soma do número A + o número B for menor que o número C
		else if (soma < nC) {
			System.out.println(nA + " + " + nB + " = " + soma + " < " + nC);
			System.out.print("A Soma de A + B é Menor do que C");		
		}
		
		//se o resultado da soma do número A + o número B for igual ao número C
		else {
			System.out.println(nA + " + " + nB + " = " + soma + " = " + nC);
			System.out.print("A Soma de A + B é Igual a C");
		}
		
		leia.close();
	}
}
