package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 563;
		int id = 56329;
		long pontosAcumulados = 3_134_634_223L;
		
		// Tipos Numericos reais
		float salario = 11_445F;
		double vendasAcumuladas = 2_991_787_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; // true
		//tipo caractere
		char status = 'A'; // ativo
		
		// dias de empresa
		System.out.println(anosDeEmpresa *  365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		//pontos acumulados
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "ganha -->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
