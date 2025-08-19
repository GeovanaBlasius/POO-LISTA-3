import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número para verificarmos se é primo ou não: ");
        int n = input.nextInt();

        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.print("É um número primo ");
        } else {
            System.out.print("Não é número primo ");
        }
    }
}
