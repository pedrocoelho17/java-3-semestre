// src/CadastroArCondicionado.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
   

public class CadastroArCondicionado {
    private static List<ArCondicionado> arCondicionados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Ar Condicionado");
            System.out.println("2. Gerar Relatório");
            System.out.println("3. Fechar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    cadastrarArCondicionado();
                    break;
                case 2:
                    gerarRelatorio();
                    break;
                case 3:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    private static void cadastrarArCondicionado() {
        System.out.print("Digite o modelo (Splinter ou Portátil): ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o código: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o BTU: ");
        int btu = scanner.nextInt();

        System.out.print("O aparelho tem defeito? (true/false): ");
        boolean temDefeito = scanner.nextBoolean();
        scanner.nextLine();  // Limpar o buffer de entrada

        String tipoDefeito = "";
        if (temDefeito) {
            System.out.print("Digite o tipo de defeito: ");
            tipoDefeito = scanner.nextLine();
        }

        if (modelo.equalsIgnoreCase("Splinter")) {
            System.out.print("Digite o tipo (ex: split, janela): ");
            String tipo = scanner.nextLine();

            System.out.print("Digite o tamanho (ex: 9000, 12000): ");
            String tamanho = scanner.nextLine();

            arCondicionados.add(new ArCondicionadoSplinter(codigo, marca, tamanho, btu, temDefeito, tipoDefeito, tipo, tamanho));
        } else if (modelo.equalsIgnoreCase("Portátil")) {
            System.out.print("Digite a voltagem (ex: 110V, 220V): ");
            String voltagem = scanner.nextLine();

            System.out.print("Digite a cor: ");
            String cor = scanner.nextLine();

            arCondicionados.add(new ArCondicionadoPortatil(codigo, marca, cor, btu, temDefeito, tipoDefeito, voltagem, cor));
        } else {
            System.out.println("Modelo inválido! Somente 'Splinter' ou 'Portátil' são permitidos.");
        }
    }

    private static void gerarRelatorio() {
        if (arCondicionados.isEmpty()) {
            System.out.println("Não há ar condicionados cadastrados.");
        } else {
            System.out.println("Relatório de Ar Condicionados Cadastrados:");
            for (ArCondicionado ac : arCondicionados) {
                ac.exibiInfo();
                System.out.println("----------------------------------------");
            }
        }
    }
}
