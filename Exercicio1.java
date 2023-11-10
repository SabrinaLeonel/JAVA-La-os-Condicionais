package atividadejava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int numero; 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 1 número: ");
		
		leia.skip("\\R?");
		numero  = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("O número " + numero);
			System.out.print(" é par ");
		}
		
		else {
			System.out.print("O número " + numero);
			System.out.print(" é ímpar ");
		}

		if (numero < 0) {
			System.out.print("e negativo!");
		}
		
		else {
			System.out.print("e positivo!");
		}
		
		leia.close();	
	}
}
