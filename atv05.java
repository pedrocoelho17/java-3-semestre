import java.util.Scanner;

public class atv05 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("O maior número é: " + n1);
        }else {
            if(n1 < n2) {
            System.out.println("O maior número é: " + n2);
            }else{
            System.out.println("Os números são iguais");
            }

        }

    }

}
