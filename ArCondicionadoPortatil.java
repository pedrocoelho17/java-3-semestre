public class ArCondicionadoPortatil extends ArCondicionado {
    private String voltagem;
    private String cor;
    
    public ArCondicionadoPortatil(String modelo, String codigo, String marca, int btu, boolean defeito, String tipoDefeito,
            String voltagem, String cor) {
        super(modelo, codigo, marca, btu, defeito, tipoDefeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibiInfo(){
        super.exibiInfo();
        System.out.println("Voltagem: "+voltagem);
        System.out.println("Cor: "+cor);
    }
}
