public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Pedro", 26, 5000);

        Gerente ger = new Gerente("Claudio", 56, 10000, 500);

        System.out.println("O nome do gerente é: "+ger.getNome());
        System.out.println("O nome do funcionário é: "+func.getNome());
    }
}
