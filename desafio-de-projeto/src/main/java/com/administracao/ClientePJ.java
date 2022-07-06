package com.administracao;

import API.Registro;

public class ClientePJ implements Cliente{
    @Override
    public String RetornarIndetificacao(String numero) {
        return Registro.getInstancia().pesquisarCNPJ(numero);
    }
}
