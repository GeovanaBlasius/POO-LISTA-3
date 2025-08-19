import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo número do intervalo: ");
        int n2 = input.nextInt();

        System.out.print("Números presentes neste intervalo, ");
        for (int i=n1; i<=n2; i++) {
            if(i>n1 && i<n2){
                System.out.print(i+", ");
            }
        }
    }
}