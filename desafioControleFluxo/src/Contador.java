import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);

            int inicio = scan.nextInt();
            int fim = scan.nextInt();


            try {
                imprimirNumeros(inicio, fim);
            } catch (ParametrosInvalidosexception e) {
                System.out.println("Erro: " + e.getMessage());
            }
    }

    public static void imprimirNumeros(int inicio, int fim) throws ParametrosInvalidosexception {
        if (inicio >= fim) {
            throw new ParametrosInvalidosexception("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int aux = fim - inicio;

        for(int i = 1; i <= aux; i++){
            System.out.println(i);
        }
    }
}
