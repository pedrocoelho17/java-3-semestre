import java.util.InputMismatchException;
import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            if (idade <= 0){
                throw new IdadeInvalidaException("A idade precisa ser maior que 0.");
            }
            System.out.println("Idade " +idade+ " cadastrada com sucesso");
        }catch(NumberFormatException e){
            System.out.println("Valor digitado não válido.");
        }catch(IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }finally{
        }

    }

}
