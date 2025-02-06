import java.util.Scanner;

public class atv02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*2);

        System.out.printf("O imc é: %.2f", imc);

        scanner.close();

    }

}
