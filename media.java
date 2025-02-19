import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual a quantidade de números que deseja inserir?");
        int qtdNumeros = sc.nextInt(); 
        int soma = 0;
        double media = 0;

        int[] numeros = new int[qtdNumeros];

        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite o nome "+(i+1)+":");
            numeros[i]=sc.nextInt();
        }
        System.out.println("Nomes inseridos: ");        
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
            soma+=numeros[i];
            media = soma/i;
        }    
        
        

        System.out.println("\nQuantidade de nomes inseridos: "+numeros.length);
        sc.close();
    }
    
}
