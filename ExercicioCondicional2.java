import java.util.Scanner;

public class ExercicioCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Insira um valor");
	
	int numero1 = input.nextInt();
	
    System.out.println("Insira o próximo valor");
	
	int numero2 = input.nextInt();
	
	if (numero1 % numero2 ==0){
	
	System.out.println(numero1+ " é múltiplo de "+numero2);
	} else {	
	System.out.println(numero1+" não é multiplo de "+numero2);
}
	
	
	
	
	
	
	
	
	}

}
