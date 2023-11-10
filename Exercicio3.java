package atividadejava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		boolean doouSangue;
		int idade; 
		String nome;
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o Nome do doador: ");
		nome  = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade  = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? Digite 'true' para Sim e 'false' para Não ");
		doouSangue  = leia.nextBoolean(); 
			
		if(idade >= 18 && idade <= 69 ) {
			
			if (idade >= 60 && idade <=69 && doouSangue == false) {
				System.out.println(nome+" não está apto(a) para doar sangue!");
			}
			
			else {
				System.out.println(nome+" está apto(a) para doar sangue!");
			}
		}
		
		//Caso a pessoa não se enquadre na faixa etária necessária para doar sangue  
		else {
			System.out.println(nome+" não está apto(a) para doar sangue!");
		}
		
		leia.close();
	}
}
