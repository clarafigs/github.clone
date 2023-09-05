package com.github.clone.Model;

public class Repositorio {

    public String nome;
    public String descricao;
    public boolean publico;

    public Repositorio(String nome, String descricao, boolean publico){
        this.descricao = descricao;
        this.nome = nome;
        this.publico = publico;
    }

    public void mudarVisibilidade(){
        this.publico = !this.publico;
    }

}
