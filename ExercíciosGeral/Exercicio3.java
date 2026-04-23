import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("Número da matricula: ");
		
	String matricula = input.nextLine();
	
	System.out.println("Nome do funcionário: ");
	
	String nome = input.nextLine();
	
	System.out.println("Horas trabalhadas: ");
	
	double horas = input.nextDouble();
	
	System.out.println("Ganho por hora: ");
	
	double ganho = input.nextDouble();
	
    double salarioMensal = (ganho * horas);
    
    double salarioFinal = salarioMensal * 4;
    
    
    System.out.println("Matrícula: "+matricula);
    
    System.out.println("Nome: "+nome);
    
    System.out.println("Salário mensal: R$"+df.format(salarioMensal));
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
