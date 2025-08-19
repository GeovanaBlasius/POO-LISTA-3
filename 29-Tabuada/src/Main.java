import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Montar a tabuada de qual valor? : ");
        int tabuada = en.nextInt();
        System.out.println("Iniciar com qual valor ? : ");
        int inicio = en.nextInt();
        System.out.println("Até qual valor montar a tabuada ?: ");
        int tabuada2 = en.nextInt();

        if (inicio > tabuada2) {
            int aux = inicio;
            inicio = tabuada2;
            tabuada2 = aux;
            System.out.println("O primeiro valor precisa ser menor que segundo ");
            System.out.println("Ja fiz a troca para realizarmos a operações corretamente ");
        }

        for(int i = inicio; i <= tabuada2; i++){
            System.out.println(tabuada + " x " + i + " = " + (i * tabuada));
        }
    }
}