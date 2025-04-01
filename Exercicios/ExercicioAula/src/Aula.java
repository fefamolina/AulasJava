import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		
		final int N = 5;
		int idades [] = new int[N];
		int soma = 0;
		double media;
		int i;
		for(i = 1; i < N; i++) {
			System.out.println("Idade? ");
			idades[i] = le.nextInt();
			soma = soma + idades[i];
		}
		media = soma / N;
		System.out.println("A media de idades = " + media);
		
		System.out.println("\n\n Idades acima da media");
		for(i = 1; i < N; i++) {
			if(idades[i] > media)
				System.out.println("\t Idade acima da média: " + idades[i]);
		}
		le.close();
	}
}