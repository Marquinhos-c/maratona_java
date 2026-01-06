package praticas.orientacaoobjetos.gestor.talentos.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    void salvar(T t);

    Optional<T> buscarPorId(int id);

    List<T> listarTodos();
}
