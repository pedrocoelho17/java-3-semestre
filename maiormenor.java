import java.util.Scanner;

public class maiormenor {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] numeros =new int[5];

    for(int i=0;i<numeros.length;i++){
        System.out.println("Digite o número "+(i+1)+":");
        numeros[i]=sc.nextInt();
    }
    
    int maiorNum = numeros[0];
    int menorNum = numeros[0];

    for (int i = 1; i < numeros.length; i++){
        if (numeros[i] > maiorNum){
            maiorNum = numeros[i];
        }
        if (numeros[i] < menorNum){
            menorNum = numeros[i];
        }
    }

    System.out.println("O maior número do array é "+maiorNum);
    System.out.println("O menor número do array é "+menorNum);
    sc.close();
}

}