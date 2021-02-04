package Fundamentos;

import javax.swing.JOptionPane;

public class conversaoStringNumero {
        public static void main(String[] args) {
	String valor1 = JOptionPane.showInputDialog("Digite o primeiro Número");
	
	String valor2 = JOptionPane.showInputDialog("Digite o segundo Número");
	
	String valores = (valor1 + valor2);
	
	System.out.println(valores);
	
	double numero1 = Double.parseDouble(valor1);
	double numero2 = Double.parseDouble(valor2);
	
	double soma = numero1+numero2;
	
	System.out.println(soma);
	
	
}
}
