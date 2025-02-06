import java.util.Scanner;

public class atv10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        String senhacorreta = "ALFA";

        if(senha .equals(senhacorreta)){
            System.out.println("Porta aberta.");
        }else{
            System.out.println("Porta fechada.");
        }
    }





}
