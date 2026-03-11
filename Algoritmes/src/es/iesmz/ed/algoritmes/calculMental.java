package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.Arrays;

public class calculMental {
    private String s;

    public calculMental(String s) {
        this.s = s;
    }

    public ArrayList<Integer> calcula() {
        String[] partes = this.s.trim().split(" ");
        ArrayList<Integer> resultados = new ArrayList<Integer>();

        int resultado = Integer.parseInt(partes[0]);

        for (int i = 1; i < partes.length; i+=2) {
            switch (partes[i]) {
                case "+" -> {
                    resultado += Integer.parseInt(partes[i + 1]);
                    resultados.add(resultado);
                }
                case "-" -> {
                    resultado -= Integer.parseInt(partes[i + 1]);
                    resultados.add(resultado);
                }
            }
        }

        return resultados;
    }
}