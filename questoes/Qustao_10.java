package questoes;

import java.util.Scanner;

public class Qustao_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite sua altura");
		double alt= s.nextDouble();
		System.out.println("Digite seu peso");
		double peso= s.nextDouble();
		
		double pesoid= ((72.7*alt)-58);
		
		System.out.println("Peso ideal = "+pesoid);

		
	}

}
