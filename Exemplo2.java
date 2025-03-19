import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Digite x: ");
        int x = sc.nextInt();
        int y = 100/x;
        System.out.println("Resultado: " + y);
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

