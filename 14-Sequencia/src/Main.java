import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números da série você quer ?: ");
        int quantidade = input.nextInt();

        int m = 1;
        float result;
        float s = 0;

        for (int n = 1; n <= quantidade; n++) {
            result = (float) n / m;
            System.out.printf("%d/%d = %.2f%n", n, m, result);
            m = m + 2;
            s += result;
        }
        System.out.printf("Resultado final da série = %.2f%n", s);
    }
}
