package com.mycompany.cadastroveiculos;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String getDescricao() {
        return "Moto - " + marca + " " + modelo + " - Cilindrada: " + cilindrada + "cc";
    }

    // Getters e Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
