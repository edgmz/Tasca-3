package es.iesmz.ed.algoritmes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        calculMental c = new calculMental("15 + 8 - 7 + 10 - 3");

        System.out.println(c.calcula());
    }
}