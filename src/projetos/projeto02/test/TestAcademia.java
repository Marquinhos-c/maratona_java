package projetos.projeto02.test;

import projetos.projeto02.dominio.Aluno;
import projetos.projeto02.dominio.Professor;

public class TestAcademia {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcos", 22, 72, 1.79);
        Professor professor = new Professor("José", "Musculação", 1010);

        // Usando a versão sem parâmetros (usa atributos do objeto)
        double imc2 = aluno1.calcularImc();
        String classificacao2 = aluno1.classificacaoImc(imc2);

        // Usando a versão com parâmetros (sobrecarregada)
        double imc1 = aluno1.calcularImc(70, 1.78);
        String classificacao1 = aluno1.classificacaoImc(imc1);

        // Impressão dos dados
        aluno1.dadosAluno();

        System.out.println("\n--- Teste IMC com valores manuais ---");
        System.out.println(classificacao1);

        System.out.println("\n--- Teste IMC com atributos do objeto ---");
        System.out.println(classificacao2);
    }
}
