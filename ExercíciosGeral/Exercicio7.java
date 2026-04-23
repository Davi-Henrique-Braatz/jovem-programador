import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Scanner input = new Scanner(System.in);
	
	DecimalFormat df = new DecimalFormat("0,00");
		
			
			
			
	
	
	System.out.println("Insira o valor A: ");
	
	double valorA = input.nextDouble();
	
	System.out.println("Insira o valor B: ");
	
	double valorB = input.nextDouble();
	
	System.out.println("Insira o valor C: ");
	
	double valorC = input.nextDouble();
	
	double areaTrianguloRetangulo = (valorA*valorB)/2;
	
 
    double areaCirculo = 3.14 * Math.pow(valorC,2);
 
 double baseTrapezio = valorA * valorB;
 
 double areaTrapezio = baseTrapezio * valorC;
 
 double areaQuadrado = valorB * valorB;
 
 double areaRetangulo = valorA * valorB;
 
 System.out.println("A área do Triangulo Retângulo é:"+areaTrianguloRetangulo+"cm²");
		 
		System.out.println("A área do circulo será: "+ df.format(areaCirculo)+"cm²");
		
		System.out.println("A área do Trapézio será: "+areaTrapezio+"cm²");
		
		System.out.println("A área do Quadrado será: "+areaQuadrado+"cm²");
		
		System.out.println("A área do Retângulo será: "+areaRetangulo+"cm²");
	
	
	
	}

	
}
