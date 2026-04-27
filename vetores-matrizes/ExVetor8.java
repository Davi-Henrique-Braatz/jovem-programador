
public class ExVetor8 {
public static void main(String[] args) {
	
	
	int somaValor = 0;
	int maiorNumero = Integer.MIN_VALUE;
	int vetor[] = new int[5];
	
	vetor[0] = 67;
	vetor[1] = 46;
    vetor[2] = 23;
    vetor[3] = 12;
    vetor[4] = 98;

    for(int i = 0; i < vetor.length; i++) {
    	
    	
    	
    	somaValor += vetor[i];
    	
    }double media = somaValor / 5;
    
    for( int i = 0; i < 5 ; i++)
    if( vetor[i] > media) {
    	
    System.out.println(vetor[i] + " ");	
    	
    }
    
}

}
