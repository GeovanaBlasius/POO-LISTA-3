import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = input.nextInt();

        int totalDivisoes = 0;

        System.out.println("Números primos entre 1 e " + N + ":");

        for (int n = 2; n <= N; n++) {
            boolean primo = true;
            int divisoes = 0;

            for (int i = 2; i < n; i++) {
                divisoes++;
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
            totalDivisoes += divisoes;

            if (primo) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\nTotal de divisões executadas: " + totalDivisoes);
    }
}
