import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nCompra nas lojas Tabajara: ");

        while (true) {
            int i = 0;
            double Vtotal = 0;

            while (true) {
                i++;
                System.out.print("Produto" + i + " : R$ ");
                double preco = input.nextDouble();

                if (preco == 0) {
                    break;
                }
                Vtotal += preco;
            }
            System.out.printf("Total: R$ %.2f%n", Vtotal);

            System.out.print("Dinheiro recebido do cliente : R$ ");
            double dinheiro = input.nextDouble();

            double troco = dinheiro - Vtotal;
            System.out.printf("Troco: R$ %.2f%n", troco);
        }
    }
}