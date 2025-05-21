import java.util.ArrayList;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite quantos números quiser.");

        int entrada;
        
        do {
            System.out.print("Digite um número (ou -1 para encerrar): ");
            entrada = scanner.nextInt();
            
            if (entrada != -1) {
                numeros.add(entrada);
            }
        } while (entrada != -1);
        
        System.out.println("\nNúmeros que são múltiplos de 3:");
        int contador = 0;
        
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            
            if (numero % 3 == 0) {
                System.out.println(numero);
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("Nenhum múltiplo de 3 foi encontrado.");
        }
        
        scanner.close();
    }
}