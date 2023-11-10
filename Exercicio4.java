package atividadejava;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {	
		String subDivisao, classe, ordem; 	
		Scanner leia = new Scanner(System.in);
		
		// Primeira entrada de dados
		System.out.println("Escreva uma dessas duas Subdivisões de Animais: Vertebrado ou Invertebrado: ");
		subDivisao  = leia.nextLine();
		
		//Caso a Subdivisão "vertebrado" seja escolhida
        if (subDivisao.equalsIgnoreCase("vertebrado")) {
        	subDivisao = "vertebrado";	
    		System.out.println("Escreva uma dessas duas Classes de Animais: Ave ou Mamífero: ");	
    		classe  = leia.nextLine();
    		
    		//Caso a classe "Ave" seja escolhida
    		if (classe.equalsIgnoreCase("Ave")) {
    			System.out.println("Escreva uma dessas duas Ordens de Animais: Carnívoro ou Onívoro: ");
    			ordem = leia.next();
    			
    		    //Caso a ordem "Carnívoro" seja escolhida
        		if (ordem.equalsIgnoreCase("Carnívoro")) {
        			System.out.println("Esse animal é uma Águia");
        		}
        		
        		//Caso a ordem "Onívoro" seja escolhida
        		if (ordem.equalsIgnoreCase("Onívoro")) {
        			System.out.println("Esse animal é uma Pomba");
        		}
    		}			
    		
    		//Caso a classe "Mamífero" seja escolhida
    		if (classe.equalsIgnoreCase("Mamífero")) {
    			System.out.println("Escreva uma dessas duas Ordens de Animais: Onívoro ou Herbívoro ");
    			ordem = leia.next();
    			
    		    //Caso a ordem "Onívoro" seja escolhida
        		if (ordem.equalsIgnoreCase("Onívoro")) {
        			System.out.println("Esse animal é o Homem");
        		}
        		
        		//Caso a ordem "Herbívoro" seja escolhida
        		if (ordem.equalsIgnoreCase("Herbívoro")) {
        			System.out.println("Esse animal é uma Vaca");
        		}
    		}
        } 
        
        //Caso a Subdivisão "Invertebrado" seja escolhida
        if (subDivisao.equalsIgnoreCase("Invertebrado")) {
        	subDivisao = "invertebrado";	
    		System.out.println("Escreva uma dessas duas Classes de Animais: Inseto ou Anelídeo: ");	
    		classe  = leia.nextLine();
    		
    		//Caso a classe "Inseto" seja escolhida
    		if (classe.equalsIgnoreCase("Inseto")) {
    			System.out.println("Escreva uma dessas duas Ordens de Animais: Hematófago ou Herbívoro: ");
    			ordem = leia.next();
    			
    			//Caso a ondem "Hematófago" seja escolhida
        		if (ordem.equalsIgnoreCase("Hematófago")) {
        			System.out.println("Esse animal é uma Pulga");
        		}
        		
        		//Caso a ordem "Herbívoro" seja escolhida
        		if (ordem.equalsIgnoreCase("Herbívoro")) {
        			System.out.println("Esse animal é uma Lagarta");
        		}
    		}
    		
    		//caso a classe "Anelídeo" seja escolhida
    		if (classe.equalsIgnoreCase("Anelídeo	")) {
    			System.out.println("Escreva uma dessas duas Ordens de Animais: Hematófago ou Onívoro ");
    			ordem = leia.next();
    			
    			//caso a ordem "Hematófago" seja escolhida
        		if (ordem.equalsIgnoreCase("Hematófago")) {
        			System.out.println("Esse animal é o Sanguessuga");
        		}
        		
        		//caso a ordem "Onívoro" seja escolhida
        		if (ordem.equalsIgnoreCase("Onívoro")) {
        			System.out.println("Esse animal é uma Minhoca");
        		}
    		}
        }
			
		leia.close();
	}
}
