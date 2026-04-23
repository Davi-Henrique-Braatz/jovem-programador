import java.util.Scanner;

public class ExercicioCondicional8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
	System.out.println("Insira o primeiro número: ");
	
	double numero1 = input.nextDouble();
	
	System.out.println("Insira o segundo número: ");
	
	double numero2 = input.nextDouble();
	
	System.out.println("Qual operação deseja fazer? \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão");
	
	int operacao = input.nextInt();
	
	if (operacao == 1) {
		
		double operacao1 = numero1 + numero2;
	
		System.out.println("O resultado desta operação é: "+operacao1);
		
	}
	
	else if (operacao == 2) {
		
		double operacao2 = numero1 - numero2;
	
		System.out.println("O resultado desta operação é: "+operacao2); 
		
	}
	
	else if (operacao == 3) {
		
		double operacao3 = numero1 * numero2;
		
		System.out.println("O resultado desta operação é: "+operacao3);
		
		
	}
	
	else if (operacao == 4) {
		
		double operacao4 = numero1 / numero2;
		
		System.out.println("O resultado desta operação é: "+operacao4);
	}
	
	
	
	}

}
