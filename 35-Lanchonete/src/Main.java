import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int codigo;
        int quantidade;
        double total = 0;

        System.out.println("=== Cardápio ===");
        System.out.println("100 - Cachorro Quente - R$ 1.20");
        System.out.println("101 - Bauru Simples   - R$ 1.30");
        System.out.println("102 - Bauru com ovo   - R$ 1.50");
        System.out.println("103 - Hambúrguer      - R$ 1.20");
        System.out.println("104 - Cheeseburguer   - R$ 1.30");
        System.out.println("105 - Refrigerante    - R$ 1.00");
        System.out.println("Digite 0 para encerrar o pedido.\n");

        while (true) {
            System.out.print("Digite o código do item: ");
            codigo = en.nextInt();
            if (codigo == 0) break;

            System.out.print("Digite a quantidade: ");
            quantidade = en.nextInt();

            double preco = 0;
            String item = "";

            if (codigo == 100) { preco = 1.20; item = "Cachorro Quente"; }
            else if (codigo == 101) { preco = 1.30; item = "Bauru Simples"; }
            else if (codigo == 102) { preco = 1.50; item = "Bauru com ovo"; }
            else if (codigo == 103) { preco = 1.20; item = "Hambúrguer"; }
            else if (codigo == 104) { preco = 1.30; item = "Cheeseburguer"; }
            else if (codigo == 105) { preco = 1.00; item = "Refrigerante"; }
            else {
                System.out.println("Código inválido!");
                continue;
            }
            double valorItem = preco * quantidade;
            total += valorItem;

            System.out.println(item + " - Quantidade: " + quantidade + " - Valor: R$ " + String.format("%.2f", valorItem));
        }
        System.out.println("\nTotal a pagar: R$ " + String.format("%.2f", total));
    }
}
