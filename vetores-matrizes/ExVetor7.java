import java.text.DecimalFormat;
import java.util.Scanner;

public class ExVetor7 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat();
	double vetor[] = new double[10];
	
	for(int i = 0; i < 10; i++) {
		
		System.out.println("Digite um valor: ");
		vetor[i] = input.nextDouble();
		
		
	}for(int i  = 0; i < 10; i++) {
		
	if (i % 2 == 0) {
		
	vetor[i] *= 0.05;	
	
		
	}else {
		
		vetor[i] *= 0.02;
		
	}
		
	}System.out.println("Vetor final: ");
	for (int i = 0; i < 10; i++) {
		System.out.println(vetor[i] + " ");
		
		
	}
	
	
}
}
