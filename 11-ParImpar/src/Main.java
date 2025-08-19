import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int par = 0;
        int impar = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "° numero: ");
            int num = input.nextInt();
            if(num % 2 == 0) {
                par = par + 1;
            }else  {
                impar = impar + 1;
            }
        }
        System.out.println("Foram digitados [" + par + "] n°s Pares, e [" + impar + "] Ímpares");
    }
}