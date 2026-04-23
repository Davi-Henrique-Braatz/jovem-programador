import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Primeiro valor: ");
	
	double valorA = input.nextDouble();
	
	System.out.println("Segundo valor: ");
	
	double valorB = input.nextDouble();
	

	double notaA = 3.5;
			
			double notaB = 6.5;
			
			double valorFa = valorA + notaA;
	
	double valorFb = valorB + notaB;
			
			double somaPeso = notaA + notaB;
			
			double valor1 = valorFa + valorFb;
			
			double valorFinal = (valor1/somaPeso);
	
	
	System.out.println("O valor final da média ponderada é: "+valorFinal);
	
	
	
	
	
	
	
	
	}

}
