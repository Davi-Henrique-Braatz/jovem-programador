import java.util.Scanner;

public class ExercicioCondicional11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

	int carta1, carta2, carta3;
	
int contador = 0;

System.out.println("Insira a primeira carta: ");

carta1 = input.nextInt();

System.out.println("Insira a segunda carta: ");
carta2 = input.nextInt();
 
System.out.println("Insira a terceira carta: ");
carta3 = input.nextInt();

if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
	
	
	               contador++;
	               
	}
	
	if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
		
		contador++;
		
	}
	
	
if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
		
		contador++;
		
	}
	
	if (contador == 1) {
		
		System.out.println("TRUCO!");

	}else if(contador == 2) {
		
		System.out.println("SEIS!");
		
	}else if(contador == 3) {
		
		System.out.println("NOVE!");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
