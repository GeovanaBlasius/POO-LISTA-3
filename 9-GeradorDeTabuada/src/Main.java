import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nVamos fazer a tabuada ");
        System.out.print("Tabuada de qual número você quer que eu faça? : ");
        int n1=input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i) );
        }
    }
}