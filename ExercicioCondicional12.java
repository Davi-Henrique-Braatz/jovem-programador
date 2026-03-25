import java.util.Scanner;

public class ExercicioCondicional12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a idade de Marquinhos: ");
		int idadeMarquinhos = input.nextInt();
		
		System.out.println("Insira a idade de Zezinho:");
		int idadeZezinho = input.nextInt();
		
		System.out.println("Insira a idade de Luluzinha: ");
		int idadeLuluzinha = input.nextInt();
		
		if (idadeMarquinhos > idadeZezinho && idadeMarquinhos > idadeLuluzinha) {
			
			System.out.println("Marquinhos é o mais velho");
	
		}
		else if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
			
			System.out.println("Marquinhos é o mais novo");			
		}
		
		else if (idadeMarquinhos < idadeZezinho && idadeMarquinhos > idadeLuluzinha || idadeMarquinhos > idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
			
			System.out.println("Marquinhos é o irmão do meio");
		}
		
      if (idadeZezinho > idadeMarquinhos && idadeZezinho > idadeLuluzinha) {
			
			System.out.println("Zezinho é o mais velho");
	
		}
	 else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
			
			System.out.println("Zezinho é o mais novo");			
		}
		
     else if (idadeZezinho < idadeMarquinhos && idadeZezinho > idadeLuluzinha || idadeZezinho > idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
			
			System.out.println("Zezinho é o irmão do meio");
		}
				
     if (idadeLuluzinha > idadeMarquinhos && idadeLuluzinha > idadeZezinho) {
	
	System.out.println("Luluzinha é a mais velha");

   }
    else if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha < idadeZezinho) {
	
	System.out.println("Luluzinha é a mais nova");			
   }

    else if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha > idadeZezinho || idadeLuluzinha > idadeMarquinhos && idadeLuluzinha < idadeZezinho) {
	
	System.out.println("Luluzinha é a irmã do meio");

   }









		
	}

}
