import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantos numeros da sequencia de Fibonacci você quer que eu apresente: ");
        int n = input.nextInt();

        int a = 1;
        int b = 1;
        
        if(n>=1) System.out.print(a + " ");
        if(n>=2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) { // i=3 por conta dos odis primeiros termos ja serem informados acima
            int prox = a + b;
            System.out.print(prox + " ");
            a = b;
            b = prox;
        }
    }
}