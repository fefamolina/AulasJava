public class Pilha {

    final int N = 32;
    int topo;
    char dados [] = new char[N];

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

    public void push(char elem) {
        if (isFull())
            System.out.println("Stack overflow");
        else {
            dados[topo] = elem;
            topo++;
        }
    }

    public char top() {
        return(dados[topo-1]);
    }

    public int pop() {
        topo--;
        return(dados[topo]);
    }
}
