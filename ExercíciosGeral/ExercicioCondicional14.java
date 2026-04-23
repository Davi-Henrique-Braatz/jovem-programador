import java.util.Scanner;

public class ExercicioCondicional14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Insira o dia: ");
	int dia = input.nextInt();
	
	if (dia < 1 || dia > 31) {
		
		System.out.println("O dia é invalido");
		
		System.exit(dia);
					
		
	}
	
	
	System.out.println("Insira o mês: ");
	int mes = input.nextInt();
	
	if (mes < 1 || mes > 12) {
		
		System.out.println("O mês é inválido");
		System.exit(mes);
	}
	
	System.out.println("Insira o ano: ");
	int ano = input.nextInt();
	
if (ano > 2026) {
	
	System.out.println("O ano é inválido");
	System.exit(ano);
	
	
}
	
	System.out.println("A data é: ("+dia+"/"+mes+"/"+ano+"");
	 

	
	
	
	
	}

	
}
