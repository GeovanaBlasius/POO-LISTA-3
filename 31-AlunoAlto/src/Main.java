import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int numeroAluno;
        int numMaisAlto = 0, numMaisBaixo = 0;
        int altura, maiorAltura = 0, menorAltura = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno: ");
            numeroAluno = en.nextInt();

            System.out.print("Digite a altura do aluno (em cm): ");
            altura = en.nextInt();

            if (i == 1) { // primeiro aluno serve para iniciar as comparações
                maiorAltura = menorAltura = altura;
                numMaisAlto = numMaisBaixo = numeroAluno;
            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    numMaisAlto = numeroAluno;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    numMaisBaixo = numeroAluno;
                }
            }
        }

        System.out.println("\n::::: RESULTADO :::::");
        System.out.println("Aluno mais alto: número " + numMaisAlto + " com " + maiorAltura + " cm");
        System.out.println("Aluno mais baixo: número " + numMaisBaixo + " com " + menorAltura + " cm");
    }
}
