import java.util.Scanner;

public class ExercicioCondicional9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
	System.out.println("Insira uma letra: ");
	
	char letra = input.next().charAt(0);
	
	letra = Character.toUpperCase(letra);
	
	
	
	if (letra == 'A' || letra =='E' || letra == 'I' || letra == 'O' || letra == 'U' ) {
	
		System.out.println("É uma vogal");
								
	}
	
	else {
		
		System.out.println("Não é uma vogal");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
