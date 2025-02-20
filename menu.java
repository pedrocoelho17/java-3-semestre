import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    // Lista para armazenar os pares (nome, número)
    private static ArrayList<String[]> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        // Exibe o menu e processa as opções
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            
            switch (opcao) {  
                case 1:
                    cadastrar(scanner);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    excluir(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
    
    // Método para cadastrar uma nova pessoa com nome e número
    public static void cadastrar(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();
        
        // Armazena o par (nome, número) na lista
        String[] cadastro = { nome, numero };
        lista.add(cadastro);
        System.out.println("Cadastro realizado com sucesso!");
    }
    
    // Método para listar os itens cadastrados
    public static void listar() {
        if (lista.isEmpty()) {
            System.out.println("Não há cadastros realizados.");
        } else {
            System.out.println("Cadastros realizados:");
            for (int i = 0; i < lista.size(); i++) {
                String[] cadastro = lista.get(i);
                System.out.println((i + 1) + ". Nome: " + cadastro[0] + ", Número: " + cadastro[1]);
            }
        }
    }
    
    // Método para excluir um item da lista
    public static void excluir(Scanner scanner) {
        if (lista.isEmpty()) {
            System.out.println("Não há cadastros para excluir.");
        } else {
            System.out.print("Digite o número do cadastro que deseja excluir: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            if (indice > 0 && indice <= lista.size()) {
                lista.remove(indice - 1);
                System.out.println("Cadastro excluído com sucesso!");
            } else {
                System.out.println("Índice inválido!");
            }
        }
    }
}
