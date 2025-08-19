import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Estamos falando de quantas pessoas ? ");
        int pessoas = input.nextInt();
        int somaIdade = 0;
        double media = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.print("Digite a idade da " + i + "° pessoa: ");
            int idade = input.nextInt();
            somaIdade += idade;
        }

        media = (double) somaIdade / pessoas;

        if(media > 0 && media <=25 ){
            System.out.print("Turma jovem");
        }else if (media >= 26 && media <= 60 ){
            System.out.print("Turma adulta");
        }else if (media > 60){
            System.out.print("Turma idosa");
        }

    }
}