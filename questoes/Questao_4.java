package questoes;

import java.util.Scanner;


public class Questao_4 {
		
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		System.out.println("Digite 1 numero.");
		double num = s.nextDouble();
		double qua = (num*num);
		System.out.println("Numero = "+num);
		System.out.println("Quadrado do Numero = "+qua);
		
		
	}

}
