import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        String numero = en.nextLine();

        System.out.print("Número invertido: ");

        for (int i = numero.length() - 1; i >= 0; i--) {
            System.out.print(numero.charAt(i));
        }
        System.out.println();
    }
}
