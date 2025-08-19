import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        nome = nome.toUpperCase();

        System.out.print("Informe sua senha : ");
        String senha = input.nextLine();
        senha = senha.toUpperCase();

        while(senha.equals(nome)) {
            System.out.println("ERRO INFORME UMA SENHA DIFERENTE DO SEU NOME: ");

            System.out.print("Informe um senha Válida : ");
            senha = input.nextLine();
            senha = senha.toUpperCase();
        }
        System.out.print("Informações aceitas ");
    }
}