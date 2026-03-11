package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que representa un cálculo mental basado en una cadena de operaciones.
 * Permite evaluar sumas y restas secuenciales y devolver los resultados intermedios.
 */
public class calculMental {

    /** Cadena que contiene la expresión a calcular (ej. "3 + 2 - 1") */
    private String s;

    /**
     * Constructor que inicializa la expresión a evaluar.
     *
     * @param s Cadena que representa la expresión matemática con números y operadores separados por espacios
     */
    public calculMental(String s) {
        this.s = s;
    }

    /**
     * Calcula los resultados intermedios de la expresión.
     * La expresión debe tener el formato: "número operador número operador número ...".
     * Solo se permiten operadores + y -.
     *
     * @return ArrayList de enteros con los resultados después de cada operación
     */
    public ArrayList<Integer> calcula() {
        // Separar la expresión por espacios
        String[] partes = this.s.trim().split(" ");

        // Lista para almacenar los resultados intermedios
        ArrayList<Integer> resultados = new ArrayList<Integer>();

        // Inicializar el resultado con el primer número
        int resultado = Integer.parseInt(partes[0]);

        // Recorrer la expresión y realizar las operaciones
        for (int i = 1; i < partes.length; i += 2) {
            switch (partes[i]) {
                case "+" -> {
                    resultado += Integer.parseInt(partes[i + 1]);
                    resultados.add(resultado);
                }
                case "-" -> {
                    resultado -= Integer.parseInt(partes[i + 1]);
                    resultados.add(resultado);
                }
                default -> {
                    throw new IllegalArgumentException("Operador no soportado: " + partes[i]);
                }
            }
        }

        return resultados;
    }
}