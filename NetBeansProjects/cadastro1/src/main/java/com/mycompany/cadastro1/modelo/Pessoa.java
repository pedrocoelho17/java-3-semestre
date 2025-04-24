package com.mycompany.cadastro1.modelo;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    
    public Pessoa(){        
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
   
    public Pessoa(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
}
