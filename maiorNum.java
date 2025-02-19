import java.util.Scanner;

public class maiorNum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numeros =new int[5];
        int maiorNum = numeros[0];
        int menorNum = numeros[0];

        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite o número "+(i+1)+":");
            numeros[i]=sc.nextInt();
        }
        
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maiorNum){
                maiorNum = numeros[i];
            }

        }

        System.out.println("O maior dos elementos do array é "+maiorNum);
        sc.close();
    }
    
    }

