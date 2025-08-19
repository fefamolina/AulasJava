package teste;

import pilhas.Pilhaint;

public class MainTeste {

	public static void main(String[] args) {
		
		Pilhaint pilha =  new Pilhaint();
		pilha.init();
		pilha.push(10);
		pilha.push(12);
		pilha.push(33);
		pilha.push(44);
		pilha.push(55);
		pilha.push(66);
		pilha.push(77);	

		pilha.esvazia();
	}
}
