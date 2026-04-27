
public class ExercicioMatriz3 {
public static void main(String[] args) {
	
	int[][] A = {
			
			{1, 2} ,
			{3, 4}			
			
	};
	
	int[][] B = {
			
			{5, 6} ,
			{7, 8}
			
	};
	
	int soma[][] = new int [2][2];
	
	for(int i = 0; i < 2; i++) {
		
		for(int j = 0; j < 2; j++) {
			
			soma[i][j] = A[i][j] + B[i][j];
			
			
		}
		
	}System.out.println("A soma da matriz é: ");
	for ( int i = 0; i < 2; i++) {
		
		for(int j = 0; i < 2; i++) {
			
			System.out.print(soma[i][j] + " ");
			
		}System.out.println();
		
	}
	
}
}
