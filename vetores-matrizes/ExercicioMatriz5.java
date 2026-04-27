import java.util.Scanner;

public class ExercicioMatriz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

int dados[][] = new int [30][3];


for (int i = 0; i < 30; i++) {
	
	System.out.println("Pessoa" + (i + 1));
	
	System.out.println("Sexo \n 1=fem 2=masc: ");
	dados[i][0] = input.nextInt();
	
	System.out.println("Nota 0 a 10: ");
	
	dados[i][1] = input.nextInt();
	
	System.out.println("Idade: ");
	dados[i][2] = input.nextInt();
	
}double somaNotas = 0;
		double somaNotaHomens = 0;
int quantHomens = 0;

int mulherMaisJovem = Integer.MAX_VALUE;

int notaMulherJovem = 0;

for (int i = 0; i < 30; i++) {
	
	int sexo = dados[i][0];
	
	int nota = dados[i][1];
	
	int idade = dados[i][2];
	
	somaNotas += nota;
	
	if(sexo == 2) {
		
		
		somaNotaHomens += nota;
		quantHomens++;
	}
	if (sexo == 1 && idade < mulherMaisJovem) {
		
		mulherMaisJovem = idade;
		
		notaMulherJovem = nota;
			
	}
	
}

double mediaCinema = somaNotas / 30;
double mediaHomens = somaNotaHomens / quantHomens;

int quantMulher50 = 0;

for(int i = 0; i < 30;i++);

int sexo = dados[i][0];

int nota = dados[i][1];

int idade = dados[i][2];

if(sexo == 1 && idade > 50 %% nota > mediaCinema) {
	
	
	
	
}

	
	}

}
