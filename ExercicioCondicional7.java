import java.util.Scanner;

public class ExercicioCondicional7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		  
		System.out.println("Insira seu peso: ");
		
		double peso = input.nextDouble();
		
		System.out.println("Insira sua altura: ");
		
		double altura = input.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
	
		System.out.println("O seu índice de massa corporal é: "                                                                                                                       +imc);
		
		
		
		
		
		if (imc < 18.5) {
			
			System.out.println("Magreza");
			
		}
		
		else if (imc >= 18.5 && imc <= 24.9) {
    	   
    	   System.out.println("Saudável");
    	   
       }
			

		else if (imc >= 25.0 && imc <= 29.9) {
			
			System.out.println("Sobrepeso");
		}
	    	   
	    	   
		else if (imc >= 30.0 && imc <= 34.9) {
			
			System.out.println("Obesidade Grau 1");
			
		}
		
		
		else if (imc >= 35.0 && imc <= 39.9) {
			
			System.out.println("Obesidade grau 2 \n(Severa)");
		
		}
		
		else if (imc >= 40.0) {
			
			System.out.println("Obesidade grau 3 \n(Morbida)");
			
		}
		
		
		
		
		
	}

}
