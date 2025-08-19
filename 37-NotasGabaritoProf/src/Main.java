import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);


        char gabarito[] = new char[10];

        System.out.println("=== Professor, digite o gabarito da prova ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = en.next().toUpperCase().charAt(0);
        }

        int totalAlunos = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;
        int somaNotas = 0;

        while (true) {
            totalAlunos++;
            int acertos = 0;

            System.out.println("\nDigite as respostas do aluno (A, B, C, D ou E):");

            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i+1) + ": ");
                char resposta = en.next().toUpperCase().charAt(0);

                if (resposta == gabarito[i]) {
                    acertos = acertos + 1;
                }
            }
            System.out.println("Total de acertos: " + acertos);
            System.out.println("Nota do aluno: " + acertos);

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            somaNotas = somaNotas + acertos;

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char resp = en.next().toUpperCase().charAt(0);
            if (resp != 'S') {
                break;
            }
        }
        double media = 0;

        if (totalAlunos > 0) {
            media = somaNotas * 1.0 / totalAlunos;
        }
        System.out.println("\n :::::RESULTADOS FINAIS :::::");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média da turma: " + media);
    }
}

        }