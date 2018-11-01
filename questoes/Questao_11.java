package questoes;

import java.util.Scanner;

public class Questao_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite duração do evento na fabrica em segundos");
		double dure= s.nextDouble();
		
		double hr = (dure/3600);
		double min = ((dure%3600)/60);
		double sec = ((dure%3600)%60);
		
		System.out.println("h "+hr+" m"+min+" s"+sec);

	}

}
