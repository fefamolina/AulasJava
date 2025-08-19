package exercicio4;

import java.util.Scanner;

import pilhas.Pilhaint;

public class DecBin {

	public static void main(String[] args) {
		
        Scanner le = new Scanner(System.in);
        Pilhaint pilha = new Pilhaint(); 

        System.out.print("Informe um valor em decimal: ");
        int decimal = le.nextInt();
        int resto;
        
        while (decimal != 0) {
        	resto = decimal % 2;
        	pilha.push(resto);
        	decimal = decimal / 2;
        }

        System.out.print("O valor em binário: ");
        pilha.esvazia();
        le.close();
	}

}
