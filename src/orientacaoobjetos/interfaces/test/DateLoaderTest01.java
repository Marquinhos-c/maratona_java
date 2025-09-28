package orientacaoobjetos.interfaces.test;

import orientacaoobjetos.interfaces.dominio.DataBaseLoader;
import orientacaoobjetos.interfaces.dominio.DataLoader;
import orientacaoobjetos.interfaces.dominio.FileLoad;

public class DateLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoad fileLoad = new FileLoad();

        dataBaseLoader.load();
        fileLoad.load();

        dataBaseLoader.remove();
        fileLoad.remove();

        dataBaseLoader.checkPermission();
        fileLoad.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
