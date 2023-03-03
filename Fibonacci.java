import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int anterior = 0;
        int atual = 1;
        while (atual < n) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (atual == n) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

}
