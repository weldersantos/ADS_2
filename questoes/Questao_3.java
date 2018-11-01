package questoes;

import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Digite valor da sua Hr Trabalhada");
		double hrt= s.nextFloat();
		System.out.println("Digite hrs trabalhadas no mes");
		double hrm= s.nextFloat();
		
		double slm=(hrt*hrm);
		
		System.out.println("Salario = "+slm);
		

	}

}
