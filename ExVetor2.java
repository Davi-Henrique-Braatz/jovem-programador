
public class ExVetor2 {
public static void main(String[] args) {
	
	int somaNumeros = 0;
	
	
	int vetor[] = {2, 5, -1, 12, 34};
	
	int maiorNumero = Integer.MIN_VALUE;
	
	for( int i = 0; i < vetor.length; i++) {
		if(vetor[i] > maiorNumero) {
			
			maiorNumero = vetor[i];
			
		}
			
	}
	System.out.println(maiorNumero);
	
	int menorNumero = Integer.MAX_VALUE;
	
	for(int i = 0; i < vetor.length; i++) {
		if(vetor[i] < menorNumero) {
			
			menorNumero = vetor[i];
			
			
		}
		
	}
	System.out.println(menorNumero);
	
	for(int i = 0; i < vetor.length; i++) {
	 
		somaNumeros += vetor[i];
		
		
		
		
	}double media = somaNumeros / 5;
	System.out.println(media);
	
		
	}
	
	
}

