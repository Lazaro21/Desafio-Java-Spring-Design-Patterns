package API;

public class Registro {
    private static Registro instancia = new Registro();

    public Registro() {
        super();
    }

    public static Registro getInstancia() {
        return instancia;
    }

    public String pesquisarCNPJ(String cnpj) {
        return "Nome fantasia: Agulhinha " + cnpj;
    }

    public String pesquisarCPF(String cpf) {
        return "Nome: Odeir " + cpf;
    }
}
