import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listaOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        ArrayList<String> listaStrings = new ArrayList<>();

       
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a " + i + "ª string: ");
            String str = scanner.nextLine(); 
            listaStrings.add(str); 
        }

        
        System.out.println("\nStrings antes da ordenação:");
        for (String str : listaStrings) {
            System.out.println(str);
        }

        
        Collections.sort(listaStrings);

        
        System.out.println("\nStrings após a ordenação:");
        for (String str : listaStrings) {
            System.out.println(str);
        }

        scanner.close(); 
    }
}
