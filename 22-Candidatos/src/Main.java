import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número total de votantes: ");
        int totalVotantes = input.nextInt();

        int votosC1 = 0;
        int votosC2 = 0;
        int votosC3 = 0;

        for (int i = 1; i <= totalVotantes; i++) {
            System.out.println("Votante " + i + ", escolha seu candidato:");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.print("Digite o número do candidato: ");
            int voto = input.nextInt();

            switch (voto) {
                case 1:
                    votosC1++;
                    break;
                case 2:
                    votosC2++;
                    break;
                case 3:
                    votosC3++;
                    break;
                default:
                    System.out.println("Opção inválida! Voto não contabilizado.");
                    break;
            }
        }

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + votosC1 + " votos");
        System.out.println("Candidato 2: " + votosC2 + " votos");
        System.out.println("Candidato 3: " + votosC3 + " votos");
    }
}
