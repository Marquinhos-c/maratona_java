package orientacaoobjetos.exception.exception.test;

import orientacaoobjetos.exception.exception.dominio.Leitor1;
import orientacaoobjetos.exception.exception.dominio.Leitor2;

import java.io.*;

/**
 * Abordagem moderna para manipulação de recursos externos usando try-with-resources.
 * * Recusa que implementam java.lang.AutoCloseable são fechados automaticamente
 * pelo compilador após a conclusão do bloco try, eliminando a necessidade de um 'finally'.
 *
 * @throws IOException Se ocorrer um erro durante a operação ou o fechamento automático dos recursos.
 */

public class TryWithResourcesaTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        // Recursos declarados nos parênteses do try (Leitor1 e Leitor2 devem implementar AutoCloseable)
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        // O método close() de leitor2 e leitor1 é chamado automaticamente aqui.
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
