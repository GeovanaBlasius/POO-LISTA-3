import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continua = true;
        double menor = 000;
        double maior = 000;
        int contador = 0;
        double soma = 0;

        while(continua) {
            System.out.print("Digite uma temperatura (ou digite 000 para encerrar: ");
            float temperatura = input.nextFloat();
            contador++;
            soma = soma + temperatura;

            if (temperatura == 000) {
                break;
            }

            if (menor == 000 || temperatura < menor) {
                menor = temperatura;
            }

            if (maior == 000 || temperatura > maior) {
                maior = temperatura;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Menor temperatura: %.2f%n", menor);
            System.out.printf("Maior temperatura: %.2f%n", maior);
            System.out.printf("Média das temperaturas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma temperatura informada.");
        }
    }
}