import java.util.Scanner;

public class ExVetor9 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	int vetor1[] = new int[10];
			int vetor2[] = new int[10];
	int soma[] = new int[10];
	
	System.out.println("Insira os valores do vetor 1: ");
	for ( int i = 0; i < 10; i++) {
		
		vetor1[i] = input.nextInt();
		
	}System.out.println("Insira os valores do vetor 2: ");
	for ( int i = 0; i < 10; i++) {
		
		vetor2[i] = input.nextInt();
	
	}for( int i = 0; i < 10; i++) {
		
		soma[i] = vetor1[i] + vetor2[i];
		
	}System.out.println("Vetor 1: ");
	
	for(int i = 0; i < 10; i++) {
		
		System.out.println(vetor1[i] +" ");
		
	}System.out.println("\n Vetor 2: ");
	
       for(int i = 0; i < 10; i++) {
		
		System.out.println(vetor2[i] +" ");
}System.out.println("\n Soma dos Vetores: ");
for (int i = 0; i < 10; i++) {
	
	System.out.println(soma[i] +" ");
}


}

}
