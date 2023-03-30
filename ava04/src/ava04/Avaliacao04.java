package ava04;

public class Avaliacao04 {

	public static void main(String[] args) {
		double saoPaulo = 67836.43;
		double rioDeJaneiro =  36678.66;
		double minasGerais = 29229.88;
		double espiritoSanto = 27165.48;
		double outros = 19849.53;
		
		double totalMensal = saoPaulo + rioDeJaneiro + minasGerais + espiritoSanto + outros;
		
		double repSaoPaulo = (saoPaulo / totalMensal) * 100;
		double repRioDeJaneiro = (rioDeJaneiro / totalMensal) * 100;
		double repMinasGerais = (minasGerais / totalMensal) * 100;
		double repEspiritoSanto = (espiritoSanto / totalMensal) * 100;
		double repOutros = (outros / totalMensal) * 100;

		System.out.printf("Representação percentual de São Paulo referente ao total mensal: %.2f%n" , repSaoPaulo);
		System.out.printf("Representação percentual do Rio de Janeiro referente ao total mensal: %.2f%n" , repRioDeJaneiro);
		System.out.printf("Representação percentual de Mians Gerais referente ao total mensal: %.2f%n" , repMinasGerais);
		System.out.printf("Representação percentual do Espírito Santo referente ao total mensal: %.2f%n" , repEspiritoSanto);
		System.out.printf("Representação percentual dos outros estados referente ao total mensal: %.2f%n" , repOutros);
	}

}
