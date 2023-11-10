package atividadejava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int codProduto, qtde, valorTotal = 0; 
		String Produto = "";
		Scanner leia = new Scanner(System.in);
		
		//tabela ilustrativa de Preços
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("| Código |      Produto      | Preço Unitário  |");
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("|    1   | Cachorro Quente   |    R$ 10.00     |");
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("|    2   |      X-Salada     |    R$ 15.00     |");
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("|    3   |       X-Bacon     |    R$ 18.00     |");
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("|    4   |        Bauru      |    R$ 12.00     |");
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("|    5   |    Refrigerante   |    R$ 8.00      |");
        System.out.println("+--------+-------------------+-----------------+");
        System.out.println("|    6   |  Suco de laranja  |    R$ 13.00     |");
        System.out.println("+--------+-------------------+-----------------+");
        
        //Entrada de Dados
        System.out.println("Digite o codigo do Produto: ");
        codProduto = leia.nextInt();
        System.out.println("Digitea quantidade do Produto: "); 
        qtde = leia.nextInt();
              
        //Laço Condicional Switch para calculo do valor total
        switch (codProduto) {
        	case 1:
        		valorTotal = qtde * 10;
        		Produto = "Cachorro quente";
        		break;
        	case 2: 
        		valorTotal = qtde * 15;
        		Produto = "x-Salada";
        		break;
        	case 3:
        		valorTotal = qtde * 18;
        		Produto = "x-Bacon";
        		break;
        	case 4: 
        		valorTotal = qtde * 12;
        		Produto = "Bauru";
        		break;
        	case 5:
        		valorTotal = qtde * 8;
        		Produto = "Refrigerante";
        		break;
        	case 6: 
        		valorTotal = qtde * 13;	
        		Produto = "Suco de Laranja";
        		break;
        	default:
        		System.out.println("Por favor digite um código válido");
        }
        
	    System.out.println("Produto: "+Produto);
	    System.out.println("Valor Total: "+valorTotal);
       
	    leia.close();
	}
} 	