import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Digite o 1° número: ");
        int x = sc.nextInt();
        System.out.println("Digite o 2° número: ");
        int y = sc.nextInt();
        double divisao = x/y;
        System.out.println("Resultado: "+divisao);
    }catch(InputMismatchException e){
        System.out.println("Formato inválido!");
        System.out.println("\n Detalhes do erro: "+ e.getMessage());
    }catch(ArithmeticException e){
        System.out.println("Operação inválida!");
        System.out.println("\n Detalhes do erro: "+ e.getMessage());
    }finally{
        System.out.println("Conexão estabelecida");
    }
    sc.close();

    }

}
