import java.util.Scanner;

public class Ex8 {

	static Scanner input = new Scanner(System.in); 
	
	public static int imprimirSomaAritmedica(int nota1, int nota2, int nota3) {
		return nota1 + nota2 + nota3 / 3;
			
	}
	
	
	public static void main(String[] args) {
	
System.out.println("Insira a primeira nota: ");
		int nota1 = input.nextInt();
		
		System.out.println("Insira a segunda nota: ");
		int nota2 = input.nextInt();
		
		System.out.println("Insira a terceira nota: ");
		int nota3 = input.nextInt();
		
		System.out.println(imprimirSomaAritmedica(nota1, nota2, nota3));
		
		
	}

}
