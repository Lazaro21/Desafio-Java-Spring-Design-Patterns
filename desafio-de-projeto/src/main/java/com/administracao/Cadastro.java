package com.administracao;

public class Cadastro {
    private Cliente entidade;

    public void setEntidade(Cliente entidade) {
        this.entidade = entidade;
    }

    public String mostrarDados(String id) {
        return entidade.RetornarIndetificacao(id);
    }
}
