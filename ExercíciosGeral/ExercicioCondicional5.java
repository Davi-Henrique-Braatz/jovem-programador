import java.util.Scanner;

public class ExercicioCondicional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
	  
	   
	   
	   
	   System.out.println("Insira sua idade: ");
	   
	  int idade = input.nextInt();
	  
	  
	   if (idade >= 21) {
		   
		   System.out.println("Adulto");
		   
	   }else if (idade >= 18) {
		   
		   System.out.println("Juvenil");
		   
	   }else if (idade >= 14) {
		   
		   System.out.println("Infanto-Juvenil");
		   
	   }else if (idade >= 11) {
		   
		   System.out.println("Infantil");
		   
	   }else if (idade >= 8) {
		   
		   System.out.println("Mirim");
		   
	   }else if (idade >= 5) {
		   
		   System.out.println("Pré-Mirim");
		   
	   }else {
		   
		   System.out.println("Idade Inválida, não poderá se cadastrar");
		   
	   }
	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
