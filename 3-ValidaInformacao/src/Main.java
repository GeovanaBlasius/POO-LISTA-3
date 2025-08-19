import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        int caracteres = nome.length();

        while (caracteres <= 3) {
            System.out.println("Digite um nome válido (+ de três caracteres): ");
            nome = input.nextLine();
            caracteres = nome.length();
        }
        System.out.println("Nome aceito ");

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Digite uma idade válida entre 0 e 150: ");
            idade = input.nextInt();
        }
        System.out.println("Informação da idade aceita ");

        System.out.print("Informe seu salário: ");
        float salario = input.nextFloat();

        while (salario < 0) {
            System.out.println("Informe um salário maior que ZERO : ");
            salario = input.nextFloat();
        }
        System.out.println("Informação de salário aceita ");

        System.out.println("\nInforme seu sexo : ");
        System.out.println("F - Feminino , M - Masculino");
        String sexo = input.next();
        sexo = sexo.toUpperCase();

        while (!sexo.equals("F") && !sexo.equals("M")) {
            System.out.println("Informe seu sexo corretamente [F - Feminino , M - Masculino]: ");
            sexo = input.next();
            sexo = sexo.toUpperCase();
        }
        System.out.println("Informações aceitas ");

        System.out.println("\nInforme Seu Estado Civil");
        System.out.println("S - Solteiro , C - Casado , V - Viúvo , D - Divorciado");
        String estadoCivil = input.next();

        while (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("D") && !estadoCivil.equals("V")) {
            System.out.println("Informe Seu Estado Civil corretamente: ");
            estadoCivil = input.next();
            estadoCivil = estadoCivil.toUpperCase();
        }
        System.out.println("Informação de estado civil aceita ");

        System.out.println("\nConferindo saidas");
        System.out.println("Nome: " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Salario : " + salario);
        System.out.println("Sexo : " + sexo);
        System.out.println("EstadoCivil : " + estadoCivil);
    }
}