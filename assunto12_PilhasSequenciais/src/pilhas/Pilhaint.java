package pilhas;

public class Pilhaint {
	
	final int N = 32;
	int topo;
	int dados [] = new int[N];
	
	public void init() {
		topo = 0;
	}
	
	public boolean isEmpty() {
		return (topo==0);
	}
	
	public void esvazia() {
		while (!isEmpty())
			System.out.println(pop());
	}
	
	public boolean isFull() {
		return (topo==N);
	}
	
	public void push(int elem) {
		if (isFull())
			System.out.println("Stack overflow");
		else {
			dados[topo] = elem;
			topo++;
		}
	}
	
	public int top() {
		return(dados[topo-1]);
	}
	
	public int pop() {
		topo--;
		return(dados[topo]);
	}
}
