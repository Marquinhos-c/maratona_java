package praticas.orientacaoobjetos.gestor.talentos.model;

import java.util.List;

public class FuncionarioCLT extends Funcionario implements Bonificavel{
    private final String matricula;

    public FuncionarioCLT(int id, String nome, Cargo cargo, double salario, int anosDeCasa, List<String> habilidades, String matricula) {
        super(id, nome, cargo, salario, anosDeCasa, habilidades);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.1;
    }
}
