import java.util.Scanner;

public class atv01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a força: ");
        double forca = scanner.nextDouble();

        System.out.println("Digite o distância: ");
        double distancia = scanner.nextDouble();
       
        double trabalho = forca * distancia;

        System.out.println("O trabalho é: " + trabalho);

        scanner.close();




    }
}

