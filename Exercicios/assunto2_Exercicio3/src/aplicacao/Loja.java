package aplicacao;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		double valorCompra;
		int parcelas;
		
		System.out.print("Valor da compra: R$");
		valorCompra = le.nextDouble();
		
		System.out.print("Informe o numero de parcelas: ");
		parcelas = le.nextInt();
		
		double precoFinal = 0;
		
		if (parcelas == 1)
		{
			precoFinal = valorCompra * 0.9;
		}
		else if(parcelas <= 3)
		{
			precoFinal = valorCompra; 
		}
		else if(parcelas == 4)
		{
			precoFinal = valorCompra * 1.05;
		}
		else if(parcelas == 5)
		{
			precoFinal = valorCompra * 1.06;
		}
		else if(parcelas == 6)
		{
			precoFinal = valorCompra * 1.08;
		}
		if (parcelas >= 1 && parcelas <=6) {
			System.out.println("O preco final da compra: R$"+ precoFinal);
		}
		else
			System.out.printf("O preco final da compra: R$%.2f", precoFinal);
		le.close();
	}

}
