
public class funcionario {

	String identificação;
	String nome;
	String sobrenome;
	double salarioMensal;
	
	
	

public double obterSalarioAnual() {
	
	return salarioMensal * 12;
	
	
		
	
	
}public  String obterNomeCompleto () {
	
return nome + " " + sobrenome;
}
public double obterSalarioJuro() {
	
	
		return obterSalarioAnual() * 0.05 + obterSalarioAnual();
			
			
		}
	
	





	
}
