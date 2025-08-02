package projetos.projeto01.test;

import projetos.projeto01.dominio.Cliente;
import projetos.projeto01.dominio.Funcionario;
import projetos.projeto01.dominio.Projeto;
import projetos.projeto01.dominio.Tarefa;

public class TesteSistema {
    public static void main(String[] args) {
        // Criando funcionários
        Funcionario f1 = new Funcionario("Marcos Costa", "Desenvolvedor", 150000);
        Funcionario f2 = new Funcionario("Ana Silva", "Analista", 8000);

        // Criando cliente
        Cliente cliente = new Cliente("Andre", "ACP bionergia" );

        // Criando equipe
        Funcionario[] equipe = new Funcionario[5];
        equipe[0] = f1;
        equipe[1] = f2;

        // Criando projeto
        Projeto projeto = new Projeto("Sistema Web", cliente, equipe);

        // Adicionando mais um funcionário ao projeto
        Funcionario f3 = new Funcionario("Carlos Lima", "Tester", 7000);
        projeto.adicionarFuncionario(f3);

        // Criando tarefas
        Tarefa t1 = new Tarefa("Implementar login", "Pendente", f1);
        Tarefa t2 = new Tarefa("Testar funcionalidades", "Em andamento", f3);

        // Atualizando status de tarefa
        t1.atualizarStatus("Concluída");

        // Exibindo informações
        System.out.println("=== PROJETO ===");
        System.out.println("Nome: " + projeto.getNome());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Equipe:");
        for (Funcionario f : projeto.getEquipe()) {
            if (f != null) {
                System.out.println("- " + f.getNome() + " (" + f.getCargo() + ")");
            }
        }

        System.out.println("\n=== TAREFAS ===");
        System.out.println(t1.getDescricao() + " - " + t1.getStatus() + " - Responsável: " + t1.getResponsavel().getNome());
        System.out.println(t2.getDescricao() + " - " + t2.getStatus() + " - Responsável: " + t2.getResponsavel().getNome());
    }
}


