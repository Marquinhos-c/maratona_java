package orientacaoobjetos.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucessso " + isCriado);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

