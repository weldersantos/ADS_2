package questoes;

import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	System.out.println("Digite 1 numero");
	float num1 = s.nextFloat();
	System.out.println("Digite outro numero");
	float num2= s.nextFloat();
	
	float divd=(num1);
	float divs=(num2);
	float quoc=(num1/num2);
	float rest=(num1%num2);
	
	System.out.println("Dividendo = "+divd);
	System.out.println("Divisor = "+divs);
	System.out.println("Quociente = "+quoc);
	System.out.println("Resto = "+rest);

	}

}
