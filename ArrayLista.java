import java.util.ArrayList;

public class ArrayLista {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        //Exibindo elementos do array lista
        System.out.println("Elementos do array lists de inteiros: ");
        for (Integer numero : numeros){
            System.out.println(numero);

        // exibindo numeros do array
        System.out.println("Elementos do array lists de inteiros: " + numeros);    
        }
        int tamanho = numeros.size();
        System.out.println("Tamanho do Array list: " + tamanho);

        // verificando a existencia de um elemento
        boolean existeElemento30 = numeros.contains(30);
        System.out.println("Existe o elemento 30? " + existeElemento30);

        // removendo um elemento
        numeros.remove(Integer.valueOf(30)); // removendo o valor 30
        System.out.println("Após a remoção do elemento 30: ");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
    }
}
    

