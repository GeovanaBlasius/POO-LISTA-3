import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int cod, vei, aci;
        int maior = 0, menor = 0;
        int codMaior = 0, codMenor = 0;
        int somaVei = 0;
        int somaAciMenos2k = 0;
        int qtdMenos2k = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCidade " + i + ": ");
            System.out.print("Código: ");
            cod = en.nextInt();
            System.out.print("Veículos: ");
            vei = en.nextInt();
            System.out.print("Acidentes: ");
            aci = en.nextInt();

            if (i == 1) {
                maior = menor = aci;
                codMaior = codMenor = cod;
            } else {
                if (aci > maior) {
                    maior = aci;
                    codMaior = cod;
                }
                if (aci < menor) {
                    menor = aci;
                    codMenor = cod;
                }
            }
            somaVei += vei;
            if (vei < 2000) {
                somaAciMenos2k += aci;
                qtdMenos2k++;
            }
        }
        double mediaVei = somaVei / 5.0;
        double mediaAciMenos2k = (qtdMenos2k > 0) ? somaAciMenos2k / (double)qtdMenos2k : 0;

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Maior índice: cidade " + codMaior + " com " + maior + " acidentes");
        System.out.println("Menor índice: cidade " + codMenor + " com " + menor + " acidentes");
        System.out.println("Média de veículos: " + mediaVei);
        System.out.println("Média de acidentes (<2000 veículos): " + mediaAciMenos2k);
    }
}
