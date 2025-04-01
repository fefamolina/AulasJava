package checkpoint1;

import java.util.Scanner;

public class Treinamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int disponibilidadeMax, qtdGrupos, qtdPessoas, totalPessoas;

		Scanner le = new Scanner(System.in);
		System.out.print("Quantidade de vagas total nesse treinamento: ");
		disponibilidadeMax = le.nextInt();

		System.out.println("*** Iniciada a inscricao de grupos de empresas ***");

		totalPessoas = 0;
		qtdGrupos = 0;
		int disponibilidade = disponibilidadeMax;
		int faca = 1;

		while (faca == 1) {
			System.out.print("Qual o tamanho do grupo: ");
			qtdPessoas = le.nextInt();

			if (disponibilidade >= qtdPessoas) {
				if (disponibilidadeMax * 0.40 >= qtdPessoas) {
					totalPessoas = totalPessoas + qtdPessoas;
					disponibilidade = disponibilidade - qtdPessoas;
					System.out.println("Vagas disponiveis agora = " + disponibilidade);
					qtdGrupos++;
				} else {
					System.out.println(
							"O grupo nao pode ser inscrito, pois excede a 40% da quantidade maxima de vagas (maximo 40.0)");
					System.out.println("O grupo sera inscrito no proximo treinamento");
				}
			}else {
				System.out.println("O grupo excede a quantidade de vagas remanecentes");
			}

			System.out.print("Quer continuar atendendo novas inscricoes? (1-sim)");
			faca = le.nextInt();

		}

		System.out.println("*** Encerrada as incricoes para o treinamento ***");
		System.out.println("\t Foram inscritos " + qtdGrupos + " grupos, e o treinamento sera feito para "
				+ totalPessoas + " pessoas.");
		le.close();
	}

}
