import java.util.Scanner;

public class ExercicioCondicional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner input = new Scanner(System.in);
	  
		System.out.println("Insira o valor de X: ");
		
		double valorX = input.nextDouble();
		
		
System.out.println("Insira o valor de Y: ");
		
		double valorY = input.nextDouble();
	
	if (valorX > 0 && valorY > 0) {
		
		System.out.println("Quadrante 1");
	}
	
	else if (valorX < 0 && valorY > 0) {
	
	System.out.println("Quadrante 2");
	
}
		
	else if (valorX < 0 && valorY < 0) {
		
		System.out.println("Quadrante 3");
	}
	
	else if (valorX > 0 && valorY < 0) {
		
		System.out.println("Quadrante 4");
	}
	
	
	}

}
