import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int voto;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int nulo = 0;
        int branco = 0;
        int total = 0;

        System.out.println("=== Eleição ===");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("Digite 0 para encerrar a votação.\n");

        while (true) {
            System.out.print("Digite o código do voto: ");
            voto = en.nextInt();
            if (voto == 0) {
                break;
            }

            if (voto == 1) {
                cand1 = cand1 + 1;
            } else if (voto == 2) {
                cand2 = cand2 + 1;
            } else if (voto == 3) {
                cand3 = cand3 + 1;
            } else if (voto == 4) {
                cand4 = cand4 + 1;
            } else if (voto == 5) {
                nulo = nulo + 1;
            } else if (voto == 6) {
                branco = branco + 1;
            } else {
                System.out.println("Código inválido!");
                continue;
            }
            total = total + 1;
        }
        double percNulo = 0;
        double percBranco = 0;

        if (total > 0) {
            percNulo = nulo * 100.0 / total;
            percBranco = branco * 100.0 / total;
        }
        
        System.out.println("\n RESULTADO");
        System.out.println("José: " + cand1 + " votos");
        System.out.println("João: " + cand2 + " votos");
        System.out.println("Maria: " + cand3 + " votos");
        System.out.println("Ana: " + cand4 + " votos");
        System.out.println("Votos Nulos: " + nulo);
        System.out.println("Votos em Branco: " + branco);
        System.out.println("Percentual de votos Nulos: " + percNulo + "%");
        System.out.println("Percentual de votos em Branco: " + percBranco + "%");
    }
}
