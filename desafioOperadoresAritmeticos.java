package Fundamentos;


public class desafioOperadoresAritmeticos {
  public static void main(String[] args) {
	int valor = 6 * (3 + 2);
	int base = 3*2;
	int valorSobre = (int)Math.pow(valor, 2);
	double aplica = valorSobre/base;
	
	int valorDois = 4 * 5;
    int	baseDois = 2;
    int aplicaDois = valorDois / baseDois;
    int aplica3 = (int)Math.pow(aplicaDois, 2);
    double soma = aplica - aplica3;
    
    int pote = (int)Math.pow(soma, 3);
    int dez = 10;
    int pote2 = (int)Math.pow(dez, 3);
    double somafinal = pote / pote2;
    
    System.out.println(somafinal);
    
    System.out.println("teste git");
    
    
	
	
}
}