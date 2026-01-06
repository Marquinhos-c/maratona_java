package praticas.orientacaoobjetos.gestor.talentos.model;

import java.util.List;
import java.util.Objects;

public abstract class Funcionario {
    private final int id;
    private String nome;
    private Cargo cargo;
    private double salario;
    private int anosDeCasa;
    private List<String> habilidades;

    public Funcionario(int matricula, String nome, Cargo cargo, double salario, int anosDeCasa, List<String> habilidades) {
        this.id = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.anosDeCasa = anosDeCasa;
        this.habilidades = habilidades;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnosDeCasa() {
        return anosDeCasa;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
