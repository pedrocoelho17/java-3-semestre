import java.io.*;
import java.util.Scanner;

public class CadastroPessoas {

    // Caminho do arquivo onde os dados serão armazenados
    private static final String ARQUIVO = "pessoas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            // Menu
            System.out.println("=== Menu ===");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas cadastradas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarPessoa(scanner);
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // Método para cadastrar uma pessoa
    private static void cadastrarPessoa(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        // Salvar os dados no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            writer.write(nome + "," + idade);
            writer.newLine();
            System.out.println("Pessoa cadastrada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    // Método para listar as pessoas cadastradas
    private static void listarPessoas() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            System.out.println("\n=== Lista de Pessoas ===");
            System.out.printf("%-20s %-10s\n", "Nome", "Idade");
            System.out.println("-------------------------------");

            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 2) {
                    System.out.printf("%-20s %-10s\n", dados[0], dados[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        }
    }
}
