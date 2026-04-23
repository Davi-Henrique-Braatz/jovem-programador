
import java.util.Scanner;

public class Ex1Chat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
	
		
		
		
		System.out.println("Insira o valor: ");
		double valor = input.nextDouble();
	
		System.out.println(" Método de pagamento:\n 1 - À vista\n 2 - Cartão\n 3 - Parcelado");
		
		
		
		System.out.println("Insira o método de pagamento: ");
       int metodo = input.nextInt();
       
       

		if (metodo == 1) {
			
			double descontoVista = valor * 0.1;
			double valorFinalVista = valor - descontoVista;
			
			System.out.println("O valor à vista será: "+valorFinalVista);
			
		}else if (metodo == 2) {
			
			double descontoCartao = valor * 0.05;
			double valorFinalCartao = valor - descontoCartao;
			
			System.out.println("O valor no cartão será: "+valorFinalCartao);
			
			
		}else if (metodo == 3) {
			
			System.out.println("O valor parcelado será: "+valor);
			
		}else {
			
			System.out.println("Insira algum método disponivel");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
