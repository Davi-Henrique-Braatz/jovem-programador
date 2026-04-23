import java.util.Scanner;

public class ExercicioCondicional10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	System.out.println("Insira a idade do primeiro irmão: ");
	
	int irmao1 = input.nextInt();
	
System.out.println("Insira a idade do segundo irmão: ");
	
	int irmao2 = input.nextInt();
	
System.out.println("Insira a idade do terceiro irmão: ");
	
	int irmao3 = input.nextInt();
	
	
	if (irmao1 == irmao2 && irmao1 == irmao3) {
		
		System.out.println("Trigêmios");
		
	}
	
	
	else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao1 || irmao2 == irmao3 || irmao3 == irmao1 || irmao3 == irmao2) {
		
		System.out.println("Gêmeos");
		
		
	}
	
	else {
		
		System.out.println("Apenas Irmãos");
		
		
	}
	
	}

}
