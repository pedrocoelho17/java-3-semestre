public class ArCondicionadoSplinter extends ArCondicionado {
    
    private String tipos;
    private String tamanho;
    
    public ArCondicionadoSplinter(String modelo, String codigo, String marca, int btu, boolean defeito, String tipoDefeito,
            String tipos, String tamanho) {
        super(modelo, codigo, marca, btu, defeito, tipoDefeito);
        this.tipos = tipos;
        this.tamanho = tamanho;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public void exibiInfo(){
        super.exibiInfo();
        System.out.println("Tipo: "+tipos);
        System.out.println("Tamanho: "+tamanho);
    }
}
