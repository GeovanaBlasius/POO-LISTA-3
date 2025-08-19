import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: R$ ");
        double divida = en.nextDouble();

        System.out.println("\nTabela de Parcelamento:");
        System.out.println("1 parcela - Juros 0% - Parcela: R$ " + String.format("%.2f", divida));
        System.out.println("3 parcelas - Juros 10% - Cada parcela: R$ " + String.format("%.2f", (divida + divida * 10 / 100) / 3));
        System.out.println("6 parcelas - Juros 15% - Cada parcela: R$ " + String.format("%.2f", (divida + divida * 15 / 100) / 6));
        System.out.println("9 parcelas - Juros 20% - Cada parcela: R$ " + String.format("%.2f", (divida + divida * 20 / 100) / 9));
        System.out.println("12 parcelas - Juros 25% - Cada parcela: R$ " + String.format("%.2f", (divida + divida * 25 / 100) / 12));
    }
}
