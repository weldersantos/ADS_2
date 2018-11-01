package questoes;

import java.util.Scanner;

public class Questao_8 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Digite qnt ganha por hr trabalhada");
		float qht= s.nextFloat();
		System.out.println("Digite qnts hrs trabalhada no mes");
		float ht= s.nextFloat();
		
		float sl =(qht*ht);
		
		System.out.println("Valor de salario ="+sl);
		
		

	}

}
