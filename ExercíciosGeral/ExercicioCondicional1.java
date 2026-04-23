import java.util.Scanner;

public class ExercicioCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner input = new Scanner(System.in);
     
     System.out.println("Insira o primeiro número: ");
	
	int numero1 = input.nextInt();
	
	 System.out.println("Insira o segundo número: ");
		
		int numero2 = input.nextInt();
	
	if (numero1 > numero2)  {
		
System.out.println("O valor: "+numero1+" é maior que "+numero2);

	}
	else {
		System.out.println("O valor: "+numero2+" é maior que "+numero1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
