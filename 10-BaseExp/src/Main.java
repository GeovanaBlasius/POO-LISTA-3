import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o Número da Base : ");
        int base = input.nextInt();
        System.out.print(base + " elevado a que número ? :");
        int expoente =  input.nextInt();

        int result = 1;
        for(int i = 1; i <= expoente; i++ ){
            result = result*base;
        }
        System.out.println(base + " Elevado a "+ expoente + " = " + result);
    }
}