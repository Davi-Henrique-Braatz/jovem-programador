
public class principalFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	funcionario fun1 = new funcionario();
	
	fun1.identificação = "0045450914412123123123212";
	fun1.nome = "Joãozinho";
	fun1.sobrenome = "Silva";
	fun1.salarioMensal = 3000;
	
	System.out.println(fun1.obterNomeCompleto());
	
	System.out.println("  ");
	
	System.out.println("O salário anual sem os juros será: "+fun1.obterSalarioAnual());
	
	System.out.println("  ");
	
	System.out.println("O salário final incluindo os juros será: "+fun1.obterSalarioJuro());
	
	
	}

}
