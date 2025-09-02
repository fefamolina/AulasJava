import java.util.Scanner;

public class Main {
    public static boolean isValid(String line) {
        Pilha pilha = new Pilha();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[') {
                pilha.push(c);
            }

            if (c == ')') {
                if (!pilha.isEmpty() && pilha.top() == '(') {
                    pilha.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!pilha.isEmpty() && pilha.top() == '[') {
                    pilha.pop();
                } else {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        boolean valid = isValid(line);

        System.out.println("erro = " + !valid);
    }
}