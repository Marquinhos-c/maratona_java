package praticas.orientacaoobjetos.gestor.talentos.service;

import praticas.orientacaoobjetos.gestor.talentos.model.Funcionario;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FuncionarioService {
    public Set<String> listaHabilidades(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .flatMap(f -> f.getHabilidades().stream())
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}

