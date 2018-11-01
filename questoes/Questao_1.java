package questoes;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu nome");	
	    String nome = s.nextLine();
	    System.out.println("Digite sua idade");
	    int idade = s.nextInt();
	    
	    System.out.println("Nome: "+nome);
	    System.out.println("Idade: "+idade +" Anos");


	}

}
