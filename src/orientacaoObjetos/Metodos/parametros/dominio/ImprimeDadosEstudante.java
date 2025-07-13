package orientacaoObjetos.Metodos.parametros.dominio;

// Classe responsável por imprimir os dados de um estudante
public class ImprimeDadosEstudante {
    // Método que recebe um objeto Estudante e imprime seus dados
    public void imprime(Estudante estudante){
        System.out.println("----------------");

        System.out.println("NOME: " + estudante.nome);
        System.out.println("IDADE: " + estudante.idade);
        System.out.println("SEXO: " + estudante.sexo);
    }
}
