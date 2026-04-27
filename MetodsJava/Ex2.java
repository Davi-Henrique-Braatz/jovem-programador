import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
	
	System.out.println("Insira o nome do seu colega: ");
	String nome = input.next();
	
	if(nome.equals("Diogo")) {
		
		imprimirAmigo1();
		
	}
if(nome.equals("Sophia")) {
		
		imprimirAmigo2();
		
	}
if(nome.equals("Natalia")) {
	
	imprimirAmigo3();
	
}else {
	
	System.out.println("Colega não encontrado");
	
}
	
    }
	
	public static void imprimirAmigo1() {
		
	System.out.println("O nome dele é Diogo");
		System.out.println("Ele tem 17 anos");
		System.out.println("Ele estuda inglês e trabalha em malharia");
		
		
		
	}
	public static void imprimirAmigo2() {
		
		System.out.println("O nome dela é Sophia");
			System.out.println("Ela tem 17 anos");
			System.out.println("Ela estuda inglês");
			
			
			
		}
	public static void imprimirAmigo3() {
		
		System.out.println("O nome dela é Natalia");
			System.out.println("Ela tem 17 anos");
			System.out.println("Ela estuda administração e trabalha em uma gráfica");
			
			
			
		}
	
}
