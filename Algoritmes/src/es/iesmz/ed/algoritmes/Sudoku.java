package es.iesmz.ed.algoritmes;

/**
 * Clase que representa un tablero de Sudoku de 9x9.
 * Permite crear un Sudoku y verificar si los bloques 3x3 son correctos.
 */
public class Sudoku {
    /** Matriz que representa el tablero de Sudoku */
    int[][] matriz;

    /**
     * Constructor de la clase Sudoku.
     * Valida que la matriz sea de 9x9 y que todos los números estén entre 1 y 9.
     *
     * @param matriz Matriz de enteros de 9x9 que representa el Sudoku
     * @throws Exception Si la matriz no tiene dimensiones 9x9 o contiene números fuera del rango [1,9]
     */
    public Sudoku(int[][] matriz) throws Exception {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != 9)
                throw new Exception("El sudoku debe ser de 9 números por fila");
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    throw new Exception("Los números dentro del sudoku deben estar entre 1 y 9");
                }
            }
        }
        this.matriz = matriz;
    }

    /**
     * Comprueba si los bloques 3x3 del Sudoku son correctos.
     * Un bloque es correcto si no se repite ningún número del 1 al 9 en él.
     *
     * @return true si todos los bloques son correctos, false en caso contrario
     */
    public boolean esCorrecte() {
        for (int fila = 0; fila < this.matriz.length; fila += 3) {
            for (int col = 0; col < this.matriz.length; col += 3) {
                boolean[] bloque = new boolean[this.matriz.length + 1];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int val = this.matriz[fila + i][col + j];
                        if (bloque[val]) return false;
                        bloque[val] = true;
                    }
                }
            }
        }

        return true;
    }
}