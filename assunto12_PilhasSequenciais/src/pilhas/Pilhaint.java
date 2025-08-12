package pilhas;

public class Pilhaint {
	
	final int N = 6;
	int topo;
	int dados [] = new int[N];
	
	public void init() {
		topo = 0;
	}
	
	public boolean isEmpty() {
		return (topo==0);
	}
	
	public boolean isFull() {
		return (topo==N);
	}
	
	public void push(int elem) {
		dados[topo] = elem;
		topo++;
	}
	
	public int pop() {
		topo--;
		return(dados[topo]);
	}
}
