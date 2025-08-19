import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas notas vão ser informadas? ");
        int q = input.nextInt();
        double media;
        double soma = 0;

        for (int i = 1; i <= q; i++) {
            System.out.print("informe a " + i + "° nota : ");
            int nota = input.nextInt();

            soma = soma + nota;
        }
        System.out.printf("Média = %.2f%n", soma/q);
    }
}