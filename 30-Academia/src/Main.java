import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int codigo;
        double altura, peso;

        int codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
        double maiorAltura = 0, menorAltura = 0;
        double maiorPeso = 0, menorPeso = 0;

        double somaAlturas = 0, somaPesos = 0;
        int contador = 0;

        System.out.print("Digite o código do cliente (0 para sair): ");
        codigo = en.nextInt();

        if (codigo != 0) {
            System.out.print("Digite a altura do cliente: ");
            altura = en.nextDouble();
            System.out.print("Digite o peso do cliente: ");
            peso = en.nextDouble();

            codMaisAlto = codMaisBaixo = codMaisGordo = codMaisMagro = codigo;
            maiorAltura = menorAltura = altura;
            maiorPeso = menorPeso = peso;

            somaAlturas += altura;
            somaPesos += peso;
            contador++;

            while (true) {
                System.out.print("Digite o código do cliente (0 para sair): ");
                codigo = en.nextInt();
                if (codigo == 0) break;

                System.out.print("Digite a altura do cliente: ");
                altura = en.nextDouble();
                System.out.print("Digite o peso do cliente: ");
                peso = en.nextDouble();
                somaAlturas += altura;
                somaPesos += peso;
                contador++;
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    codMaisAlto = codigo;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    codMaisBaixo = codigo;
                }
                if (peso > maiorPeso) {
                    maiorPeso = peso;
                    codMaisGordo = codigo;
                }
                if (peso < menorPeso) {
                    menorPeso = peso;
                    codMaisMagro = codigo;
                }
            }
            double mediaAlturas = somaAlturas / contador;
            double mediaPesos = somaPesos / contador;

            System.out.println("\n:::::::::RESULTADOS::::::::: ");
            System.out.println("Cliente mais alto: código " + codMaisAlto + " com " + maiorAltura + "m");
            System.out.println("Cliente mais baixo: código " + codMaisBaixo + " com " + menorAltura + "m");
            System.out.println("Cliente mais gordo: código " + codMaisGordo + " com " + maiorPeso + "kg");
            System.out.println("Cliente mais magro: código " + codMaisMagro + " com " + menorPeso + "kg");
            System.out.println("Média das alturas: " + mediaAlturas);
            System.out.println("Média dos pesos: " + mediaPesos);
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }
    }
}
