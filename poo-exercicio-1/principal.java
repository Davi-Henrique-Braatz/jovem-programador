
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pessoa pessoa1 = new pessoa();
		pessoa1.nome = "Davi";
		pessoa1.sexo = 'M';
		pessoa1.dtNascimento = "27/07/2008";
		pessoa1.estCivil = "Solteiro(a)";
		
		pessoa pessoa2 = new pessoa();
        pessoa2.nome = "Maria";
        pessoa2.sexo = 'F';
        pessoa2.dtNascimento = "18/09/2002";
        pessoa2.estCivil = "Casado(a)";
	
	System.out.println("O(a) pessoa chamada " +pessoa1.nome+" nasceu em "+pessoa1.dtNascimento+" é do sexo "+pessoa1.sexo+" e seu estado civil é "+pessoa1.estCivil);
	
	System.out.println("O(a) pessoa chamada " +pessoa2.nome+" nasceu em "+pessoa2.dtNascimento+" é do sexo "+pessoa2.sexo+" e seu estado civil é "+pessoa2.estCivil);
	}

}
