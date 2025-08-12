package teste;

import pilhas.Pilhaint;

public class MainTeste {

	public static void main(String[] args) {
		
		Pilhaint pilha =  new Pilhaint();
		pilha.init();
		pilha.push(10);
		pilha.push(12);
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
	}
}
