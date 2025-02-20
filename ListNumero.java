import java.util.ArrayList;
import java.util.Scanner;

public class ListNumero {
    public static void main(String[] args) {
        // Criação do Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Criação do ArrayList para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Laço para solicitar e adicionar 10 números ao ArrayList
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt(); // Lê o número informado
            numeros.add(numero); // Adiciona o número ao ArrayList
            
        }

        // Exibindo os números adicionados
        System.out.println("\nOs números adicionados ao ArrayList são:");
        int contador = 1;
        for (int n : numeros) {
            System.out.println("Número " + (contador) + ": " + n);
            contador++;
            if (n == 10 || n == 100 || n == 1000){
                System.out.println("Você ganhou 50 de bônus");
            } 
        }

        scanner.close(); // Fechar o scanner após o uso
    }
}




