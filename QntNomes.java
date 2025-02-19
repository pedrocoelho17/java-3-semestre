import java.util.Scanner;

public class QntNomes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual a quantidade de nomes que deseja inserir?");
        int qtdNomes = sc.nextInt();
        

        String[] nomes = new String[qtdNomes];

        for(int i=0;i<nomes.length;i++){
            System.out.println("Digite o nome "+(i+1)+":");
            nomes[i]=sc.next();
        }
        System.out.println("Nomes inseridos: ");        
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
            
        }    
        
        

        System.out.println("\nQuantidade de nomes inseridos: "+nomes.length);
        sc.close();
    }
    
}
