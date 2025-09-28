/*
Classe com alta coesão
- Tem atributos e métodos que trabalham juntos em uma mesma finalidade.
- É fácil de entender e manter.
- Segue o princípio da responsabilidade única
Ou seja: uma classe deve fazer uma coisa só, e fazer bem feito.

 */

package orientacaoobjetos.classes.dominio;
// classe com 3 atributos
public class Estudante {
    public String nome = "Junior"; // não é legal adicionar valores direto na classe
    public int idade;
    public char sexo;
}
