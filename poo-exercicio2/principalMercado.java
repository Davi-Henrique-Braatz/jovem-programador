
public class principalMercado {
public static void main(String[] args) {
	
	mercado unidadeDeBlumenau = new mercado();
	unidadeDeBlumenau.nomeMercado = "Cooper";
	unidadeDeBlumenau.numMacaVendida = 300;
	unidadeDeBlumenau.precoMaca = 0.57;
	unidadeDeBlumenau.numLarVendida = 279;
	unidadeDeBlumenau.precoLar = 0.68;
	
	mercado unidadeDeJoinville = new mercado();
	
	unidadeDeJoinville.nomeMercado = "Super Atacadista";
	unidadeDeJoinville.numMacaVendida = 150;
	unidadeDeJoinville.precoMaca = 0.78;
	unidadeDeJoinville.numLarVendida = 123;
	unidadeDeJoinville.precoLar = 0.89;
		
	mercado unidadeDeFlorianopolis = new mercado();
		
	unidadeDeFlorianopolis.nomeMercado = "Komprão";
	unidadeDeFlorianopolis.numMacaVendida = 256;
	unidadeDeFlorianopolis.precoMaca = 0.90;
	unidadeDeFlorianopolis.numLarVendida = 234;
	unidadeDeFlorianopolis.precoLar = 1.13;
	
	System.out.println("No mercado "+unidadeDeBlumenau.nomeMercado+" está vendendo a maçã por R$"+unidadeDeBlumenau.precoMaca+" e a laranja por R$" +unidadeDeBlumenau.precoLar);
	System.out.println("No mercado "+unidadeDeBlumenau.nomeMercado+" foi vendido "+unidadeDeBlumenau.numMacaVendida+" maçãs e "+unidadeDeBlumenau.numLarVendida+" Laranjas");
	System.out.println("      ");
	System.out.println("No mercado "+unidadeDeJoinville.nomeMercado+" está vendendo a maçã por R$"+unidadeDeJoinville.precoMaca+" e a laranja por R$" +unidadeDeJoinville.precoLar);
	System.out.println("No mercado "+unidadeDeJoinville.nomeMercado+" foi vendido "+unidadeDeJoinville.numMacaVendida+" maçãs e "+unidadeDeJoinville.numLarVendida+" Laranjas");
	System.out.println("      ");
	System.out.println("No mercado "+unidadeDeFlorianopolis.nomeMercado+" está vendendo a maçã por R$"+unidadeDeFlorianopolis.precoMaca+" e a laranja por R$" +unidadeDeFlorianopolis.precoLar);
	System.out.println("No mercado "+unidadeDeFlorianopolis.nomeMercado+" foi vendido "+unidadeDeFlorianopolis.numMacaVendida+" maçãs e "+unidadeDeFlorianopolis.numLarVendida+" Laranjas");
	
}
}
