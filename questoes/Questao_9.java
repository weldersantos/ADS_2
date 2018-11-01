package questoes;

import java.util.Scanner;

public class Questao_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero inteiro");
		int n1 = s.nextInt();
		System.out.println("Digite Outro numero inteiro");
		int n2 = s.nextInt();
		System.out.println("Digite um numero real");
		double n3 = s.nextDouble();
		
		float prod= ((n1*2)*(n2/2));
		double soma= ((n1*3)+n3);
		double ele= (n3*n3*n3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo"+prod);
		System.out.println("A soma do triplo do primeiro com o terceiro."+soma);
		System.out.println("O terceiro elevado ao cubo"+ele);
	}

}
