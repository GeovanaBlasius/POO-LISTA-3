import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero que você deja o fatorial: ");
        int numero = input.nextInt();

        int result = 1;
        for (int i = 1; i <= numero; i++) {
            result *= i;
        }
        System.out.println(numero + "! = " + result);
    }
}