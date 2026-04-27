import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe a atual estação do ano \n 1 - Verão \n 2 - Outono \n 3 - Inverno \n 4 - Primavera");
		int estacao = input.nextInt();
	
		if(estacao == 1) {
			
			imprimirVerao();
			
		}else if (estacao == 2) {
			
			imprimirOutono();
			
			
		}else if(estacao == 3) {
			
			
			imprimirInverno();
			
			
		}else if(estacao == 4) {
			
			imprimirPrimavera();
			
		}
		
	}
	
	public static void imprimirVerao() {
		
		System.out.println(" É verão e o clima está quente lá fora.");	
		
	}
	
	
	public static void imprimirOutono() {
		
		System.out.println(" É outono e  o clima está agradável, mas ainda está quente");
		
	}
	
public static void imprimirInverno() {
		
		System.out.println(" É inverno e o clima está agradável e frio.");
		
	}
	
	
public static void imprimirPrimavera() {
	
	System.out.println(" É primavera e o clima está agradável, porém menos frio4 ");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
