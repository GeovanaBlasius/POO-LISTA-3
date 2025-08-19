import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = input.nextInt();

        boolean primo = true;
        String divisores = "1 ";

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                divisores += i + " ";
            }
        }
        divisores += n;

        if (primo && n > 1) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
        System.out.println("Divisores de " + n + ": " + divisores);
    }
}
