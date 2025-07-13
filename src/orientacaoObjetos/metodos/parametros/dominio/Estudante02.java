package orientacaoObjetos.metodos.parametros.dominio;

public class Estudante02 {
    public String nome;
    public int idade;
    public char sexo;

    /*
    Esse método deve estar definido dentro da classe Estudante02
      e imprime as informações do estudante.
     */
    public void imprime() {
        System.out.println("----------------");
        //this - garante que ele está acessando os atributos do objeto que invocou o método.
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
