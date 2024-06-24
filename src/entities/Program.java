package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
Problema "troco"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/troco.java
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.
Exemplo 1:
Preço unitário do produto: 8.00
Quantidade comprada: 2
Dinheiro recebido: 20.00
TROCO = 4.00
Exemplo 2:
Preço unitário do produto: 30.00
Quantidade comprada: 3
Dinheiro recebido: 100.00
TROCO = 10.00
		 */
		// Variáveis
		Double precoUnit;
		int qtdProduto;
		Double dinheiroRecebido;
		Double troco;
		
		Locale.setDefault(Locale.US);
		Scanner Leia = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		precoUnit = Leia.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtdProduto = Leia.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = Leia.nextDouble();
		troco = dinheiroRecebido - (precoUnit * qtdProduto);
		System.out.printf("Troco = %.2f\n", troco);
		
		
		Leia.close();
	}

}
