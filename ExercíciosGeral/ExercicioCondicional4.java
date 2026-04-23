import java.util.Scanner;

public class ExercicioCondicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 Scanner input = new Scanner(System.in);
	
	 
	 
	 
	 System.out.println(" M (Masculino)\n F (Feminino)\n I (Não Informado)\n Insira sua sexualidade:");
	
	char sexo = input.next().charAt(0);
	
	if (sexo == 'M') {
		
		System.out.println("Masculino");
		
	}
	
	else if (sexo == 'F') {
		System.out.println("Feminino");
		
	}
	
	else if (sexo == 'I') {
		System.out.println("Não Informado");
		
	}
	
	else {
		System.out.println("Entrada Invalida");
	}
		
		
	
	
	}

}
