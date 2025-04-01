package assunto3_Exercicio1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner le = new Scanner(System.in);
		
		final int N = 10;
		double saldos[] = new double [N];
		int qtdNeg = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.println("saldo do cliente["+i+"]: ");
			saldos[i] = le.nextDouble();
			if(saldos[i] < 0) {
				qtdNeg++;
			}
		}
		System.out.println("Valores de Saldos Positivos");
		for(int i = 0; i<N; i++) {
			if(saldos[i] >= 0) {
				System.out.println("\t R$" + saldos[i]);
			}
		}
		le.close();
	}

}