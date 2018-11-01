package questoes;

import java.util.Scanner;

public class Questao_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite temperatura em Fahreinheit");
		float tempf = s.nextFloat();
		
	float tempc = (5*(tempf-32)/9);
	
	System.out.println("Conversão em celsius ="+tempc+" Graus");

	}

}
