import java.util.Scanner;

public class ExercicioCondicional13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input = new Scanner(System.in);
 
	System.out.println("Insira o salário do funcionário: ");
	double salario = input.nextDouble();
	
	System.out.println("Insira a quantidade de meses trabalhados pelo funcionário: ");
double meses = input.nextDouble();

double porcentagem5 = salario * 0.05;

double porcentagem7 = salario * 0.07;

if(meses <= 12) {
	
	 double salarioFinal5 = salario + porcentagem5;
	 
	 System.out.println("O reajuste do funcionário será: "+salarioFinal5);

}else if (meses >= 13 && meses <= 48) {
	
	double salarioFinal7 = salario + porcentagem7;
	
	System.out.println("O reajuste do funcionário será: "+salarioFinal7);
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
