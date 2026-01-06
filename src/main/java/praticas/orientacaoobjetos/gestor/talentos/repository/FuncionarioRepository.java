package praticas.orientacaoobjetos.gestor.talentos.repository;


import praticas.orientacaoobjetos.gestor.talentos.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FuncionarioRepository implements Repository<Funcionario>{

    private List<Funcionario> banco = new ArrayList<>();

    @Override
    public void salvar(Funcionario funcionario) {
        banco.add(funcionario);
    }


    @Override
    public Optional buscarPorId(int id) {
        return banco.stream()
                .filter(f -> f.getId() == id)
                .findFirst();
    }

    @Override
    public List<Funcionario> listarTodos() {
        return banco;
    }
}
