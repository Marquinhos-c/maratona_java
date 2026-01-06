package praticas.orientacaoobjetos.gestor.talentos.model;

import java.util.List;

public class FuncionarioPJ extends Funcionario{

    private final String cnpj;

    public FuncionarioPJ(int matricula, String nome, Cargo cargo, double salario, int anosDeCasa, List<String> habilidades, String cnpj) {
        super(matricula, nome, cargo, salario, anosDeCasa, habilidades);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
