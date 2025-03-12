public class VeiculoApp {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("fiat", "argo", 2024, 4);
        Moto m1 = new Moto("fan", "honda", 2025, 130);

        c1.exibiInfo();
        m1.exibiInfo();
    }
}
