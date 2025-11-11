package orientacaoobjetos.colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "123");
        map.put("nome", "Apple");
        map.put("nome2", "Apple 2"); // Não aceita key duplicada

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("----------------------");

        for (String values : map.values()) {
            System.out.println(values);
        }

        System.out.println("-----------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
