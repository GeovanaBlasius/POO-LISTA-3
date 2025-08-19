import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int numero;
        int intervalo1 = 0; // 0 a 25
        int intervalo2 = 0; // 26 a 50
        int intervalo3 = 0; // 51 a 75
        int intervalo4 = 0; // 76 a 100

        System.out.println("Digite números positivos (negativo para parar):");
        while (true) {
            numero = en.nextInt();

            if (numero < 0) break;

            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero <= 50) {
                intervalo2++;
            } else if (numero <= 75) {
                intervalo3++;
            } else if (numero <= 100) {
                intervalo4++;
            }
        }
        System.out.println("\n RESULTADO ");
        System.out.println("Intervalo 0-25: " + intervalo1);
        System.out.println("Intervalo 26-50: " + intervalo2);
        System.out.println("Intervalo 51-75: " + intervalo3);
        System.out.println("Intervalo 76-100: " + intervalo4);
    }
}
