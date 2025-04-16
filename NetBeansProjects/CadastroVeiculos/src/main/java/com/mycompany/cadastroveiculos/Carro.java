package com.mycompany.cadastroveiculos;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String getDescricao() {
        return "Carro - " + marca + " " + modelo + " - Portas: " + numeroPortas;
    }

    // Getters e Setters
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
