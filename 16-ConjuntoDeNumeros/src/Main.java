import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        if(n>1) {
            int menor, maior;
            int soma = 0;

            System.out.print("Digite o 1º número: ");
            int num = input.nextInt();
            soma = num;
            menor = num;
            maior = num;

            for (int i = 2; i <= n; i++) {
                System.out.print("Digite o " + i + "º número: ");
                num = input.nextInt();
                soma += num;

                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
            }
            System.out.println("\nMenor valor = " + menor);
            System.out.println("Maior valor = " + maior);
            System.out.println("Soma dos valores = " + soma);
        }
        else{
            System.out.print("Quantidade inválida, encerrando ");
        }
    }
}
