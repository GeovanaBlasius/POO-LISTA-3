import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números da série você quer ?: ");
        int quantidade = input.nextInt();

        int n1 = 37;
        int n2 = 38;
        double soma = 0;

        System.out.print("Resultado ");
        for (int i = 1; i <= quantidade; i++) {
            soma = soma + ((double)(n1*n2)/i) ;
            n1 --;
            n2 --;
        }
        System.out.printf("%.2f", soma);
    }
}
