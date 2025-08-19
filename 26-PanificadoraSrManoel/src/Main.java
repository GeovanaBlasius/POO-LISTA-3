public class Main {
    public static void main(String[] args) {

        double preco = 0.18;

        for(int contador = 1; contador <= 50; contador++){
            System.out.printf("\n" + contador + " - R$ " + "%.2f" ,contador*preco);
        }
    }
}