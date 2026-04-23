import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome do vendedor: ");
		
		String nome = input.nextLine();
		
		System.out.println("Salário fixo: ");
		
		double salario = input.nextDouble();
		
		System.out.println("Vendas efetuadas em R$: ");
		
		double vendas = input.nextDouble();	
			
	    double porcen = vendas*0.15;
	    
		double salarioFinal = salario + porcen;
		
		
		System.out.println("O salário final é: "+salarioFinal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
