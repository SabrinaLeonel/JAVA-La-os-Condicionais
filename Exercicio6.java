package atividadejava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int codCargo; 
		String cargo = "", nome;
		float salario = 0, novoSalario = 0;
		Scanner leia = new Scanner(System.in);
		
		//tabela ilustrativa de Cargos
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("| Código do cargo |     Cargo     | Percentual do Reajuste|");
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("|        1        |     Gerente   |          10%          |");
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("|        2        |    vendedor   |           7%          |");
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("|        3        |  Surpervisor  |           9%          |");
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("|        4        |   Motorista   |           6%          |");
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("|        5        |   Estoquista  |           5%          |");
        System.out.println("+-----------------+---------------+-----------------------+");
        System.out.println("|        6        | Técnico de TI |           8%          |");
        System.out.println("+-----------------+---------------+-----------------------+");
        
        //Entrada de Dados
        System.out.println("Digite o Nome do Colaborador : ");
        nome = leia.nextLine();
        System.out.println("Digitea o código do cargo: "); 
        codCargo = leia.nextInt();
        System.out.println("Digite o salário");
        salario = leia.nextFloat();
              
        //Laço Condicional Switch para calculo do Reajuste
        switch (codCargo) {
        	case 1:
        		novoSalario = salario + (0.10f * salario);
        		cargo = "Gerente";
        		break;
        		
        	case 2: 
        		novoSalario = salario + (0.07f* salario);
        		cargo = "Vendedor";
        		break;
        		
        	case 3:
        		novoSalario = salario + (0.09f * salario);
        		cargo = "Supervisor";
        		break;
        		
        	case 4: 
        		novoSalario = salario + (0.06f * salario);
        		cargo = "Motorista";
        		break;
        		
        	case 5:
        		novoSalario = salario + (0.05f * salario);
        		cargo = "Estoquista";
        		break;
        		
        	case 6: 
        		novoSalario = salario + (0.08f * salario);	
        		cargo = " Técnico de TI ";
        		break;
        		
        	default:
        		System.out.println("Por favor digite um código válido");
        }
        
	    System.out.println("\n\nNome do colaborador: "+nome);
	    System.out.println("Cargo: "+cargo);
	    System.out.printf("Salário: %.2f", novoSalario);
       
	    leia.close();
	}
} 	