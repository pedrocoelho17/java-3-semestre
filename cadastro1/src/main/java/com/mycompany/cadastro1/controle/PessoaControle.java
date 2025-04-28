package com.mycompany.cadastro1.controle;

import com.mycompany.cadastro1.dao.PessoaDAO;
import com.mycompany.cadastro1.modelo.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class PessoaControle {
    private PessoaDAO dao = new PessoaDAO();
    
    public void cadastrar(String nome, int idade){
        Pessoa p = new Pessoa(nome, idade);
        dao.inserir(p);
    }
    
    public ArrayList<Pessoa> listar(){
        return dao.listar();
    }
    
    public void atualizar(int id, String nome, int idade) {
        Pessoa p = new Pessoa(id, nome, idade);
        dao.atualizar(p);
    }
    
    public void remover(int id){
        dao.remover(id);
    }
    
    public ArrayList<Pessoa> buscarPorNome(String nome){
        return dao.buscarPorNome(nome);
    }
}
