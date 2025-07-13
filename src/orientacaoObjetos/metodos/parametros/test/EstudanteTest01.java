// Define o pacote onde esta classe está localizada
package orientacaoObjetos.metodos.parametros.test;

// Importa as classes Estudante e ImprimeDadosEstudante de outro pacote
import orientacaoObjetos.metodos.parametros.dominio.Estudante;
import orientacaoObjetos.metodos.parametros.dominio.ImprimeDadosEstudante;

// Classe principal que contém o método main, ponto de entrada da aplicação
public class EstudanteTest01 {
    public static void main(String[] args) {
        // Criação de dois objetos da classe Estudante
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        // Criação de um objeto da classe responsável por imprimir os dados dos estudantes
        ImprimeDadosEstudante impressora = new ImprimeDadosEstudante();

        // Atribuição de valores aos atributos do primeiro estudante
        estudante01.nome = "Marcos";   // Define o nome
        estudante01.idade = 22;        // Define a idade
        estudante01.sexo = 'M';        // Define o sexo (M = Masculino)

        // Atribuição de valores aos atributos do segundo estudante
        estudante02.nome = "Evenlly";  // Define o nome
        estudante02.idade = 18;        // Define a idade
        estudante02.sexo = 'F';        // Define o sexo (F = Feminino)

        // Chamada do método imprime passando o primeiro estudante como argumento
        // Isso permite que os dados de estudante01 sejam acessados e exibidos
        impressora.imprime(estudante01);

        // Chamada do método imprime passando o segundo estudante como argumento
        impressora.imprime(estudante02);
    }
}