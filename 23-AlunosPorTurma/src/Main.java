import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int qtdTurmas = input.nextInt();

        int somaAlunos = 0;
        for (int i = 1; i <= qtdTurmas; i++) {
            int alunos;
            do {
                System.out.print("Digite a quantidade de alunos na turma " + i + " (máx. 40): ");
                alunos = input.nextInt();
                if (alunos > 40 || alunos < 0) {
                    System.out.println("Número inválido! Cada turma deve ter entre 0 e 40 alunos.");
                }
            } while (alunos > 40 || alunos < 0);
            somaAlunos += alunos;
        }
        double media = (double) somaAlunos / qtdTurmas;
        System.out.printf("O número médio de alunos por turma é: %.2f%n", media);
    }
}
