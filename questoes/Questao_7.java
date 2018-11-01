package questoes;

import java.util.Scanner;

public class Questao_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite qtdd de metros para converter em centimetros");
		float m = s.nextFloat();
		
		float c = (m*100);
		System.out.println(m+"metro é igual a: "+c);

	}

}
