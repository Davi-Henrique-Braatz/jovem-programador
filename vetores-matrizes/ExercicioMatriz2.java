
public class ExercicioMatriz2 {
public static void main(String[] args) {
	
	 int matriz[][] = new int[2][2];
	 
	 
	 matriz[0][0] = 4;
	 matriz[0][1] = 12;
	 matriz[1][0] = 2;
	 matriz[1][1] = -3;
	
	double determinante1 = matriz[0][0] * matriz[1][1];
	double determinante2 = matriz[0][1] * matriz[1][0];
	
	double determinanteFinal = determinante1 - determinante2;
	
	System.out.print(determinanteFinal);
	
}
}
