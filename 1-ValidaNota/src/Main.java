import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua nota : ");
        float nota = input.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("Informe uma nota válida : ");
            nota = input.nextFloat();
        }
        System.out.println("Nota válida -> " + nota);
    }
}