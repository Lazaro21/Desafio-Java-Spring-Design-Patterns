package com.administracao;

public class main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Cliente pf = new ClientePF();
        Cliente pj = new ClientePJ();

        cadastro.setEntidade(pf);

        System.out.println( cadastro.mostrarDados("4568715"));
    }
}
