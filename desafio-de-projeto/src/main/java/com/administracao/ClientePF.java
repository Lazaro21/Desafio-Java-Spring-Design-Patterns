package com.administracao;

import API.Registro;

public class ClientePF implements Cliente{

    @Override
    public String RetornarIndetificacao(String numero) {
        return Registro.getInstancia().pesquisarCPF(numero);
    }
}
