import java.util.Scanner;

public class ExercicioCondi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Registre seu usuário");
		String regUsua = input.nextLine();
		
		System.out.println("Registre a sua senha: ");
		String regSenha = input.nextLine();
		
		
		System.out.println("Insira o usuário: ");
		String usuario = input.nextLine();
		
		System.out.println("Insira a senha: ");
		String senha = input.nextLine();
		
		if (senha.equalsIgnoreCase(regSenha) && usuario.equalsIgnoreCase(regUsua)) {
			
			System.out.println("Seja bem vindo "+usuario);
			
		}else {
			
	System.out.println("Senha e/ou Usuario estão incorretos");		
			System.exit(0);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}